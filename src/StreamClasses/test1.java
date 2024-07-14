package StreamClasses;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {

	//Print name start with A

	public static int basicLoop() {
		int count =0;
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Shahrukh");
		namesList.add("Akshay");
		namesList.add("Sunny");
		namesList.add("Akaay");
		namesList.add("Amitab");
		System.out.println("Test Update");
		
		for(String name:namesList) {
			String actualString = name;
			if(actualString.startsWith("A"))
				count++;
		}
		
		namesList.forEach(s -> System.out.println("---"+s));
		return count;
	}
	
	public static Long streamFilter() {
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Shahrukh");
		namesList.add("Akshay");
		namesList.add("Sunny");
		namesList.add("Akaay");
		namesList.add("Amitab");
		// There is no life for intermediate operation if there is no terminal operation
		// Terminal operation will execute only if intermediate operation returns true
		// We can create a stream directly using Stream.of()
		Long result = namesList.stream().filter(s->s.startsWith("A")).count();
		System.out.println(Stream.of("ABC","AYC","NFS","PUBG").filter(s->s.startsWith("A")).count());
		Long result2 = Stream.of("ABC","AYC","NFS","PUBG").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println("Result 2 is "+result2);
		
		//	Print name from array list lenght > 4
		System.out.println("Print all elements with length 4");
		namesList.stream().filter(s -> s.length()>4).forEach(s-> System.out.println(s));

		System.out.println("Print first elements with length 4");
		namesList.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		return result;
	}
	
	public static int streamMap() {
		//Print names which ends with 'e' and Uppercase
		Stream.of("Node","SQL","Python","Java","Javascript","Karate").filter(s->s.endsWith("e")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Print names which has first letter as 'a' with Uppercase and Sorted
		Stream.of("Selenium","WDIO","Zebra","Protractor","Stack","Postman").filter(s->s.startsWith("P")).sorted().map(s -> s.toUpperCase()).forEach(s->System.out.println(s));
		
//		------------------------- Combine Two Streams Start -------------------------
		List<String> fruits = Arrays.asList("Mango","Apple","PineApple","Kiwi","Lichi");
		List<String> vegs = Arrays.asList("Potato","Tomato","Onion","Spinach","Chilli");

		Stream<String> combinedStream = Stream.concat(fruits.stream(), vegs.stream());
//		combinedStream.sorted().forEach(s-> System.out.println(s));
//		-------------------------- Combine Two Streams End --------------------------
		
		System.out.println("Test Any Match "+combinedStream.anyMatch(s->s.equalsIgnoreCase("Apple")));
		return 1;
	}
	
	public static int streamCollect() {

//		Collect method is used to convert streams to list or maps
		List<String> techUsedList = Stream.of("Node","SQL","Python","Java","Javascript","Karate").filter(s->s.endsWith("e")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(techUsedList.get(0));
		
		
		List<Integer> valuesIntegers = Arrays.asList(23,66,76,84,21,90,56,23);
//		Print unique numbers from Array
//		Sort the array
		valuesIntegers.stream().distinct().forEach(s-> System.out.println(s));
		valuesIntegers.stream().sorted().forEach(s-> System.out.println("------"+s));
		
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(basicLoop());
//		System.out.println(streamFilter());
//		System.out.println(streamMap());
//		System.out.println(streamCollect());
		
	}
}
