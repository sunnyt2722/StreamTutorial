package StreamClasses;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apples","Mangoes","Bananas","Kiwi","Lychee","Cranberry");

		fruits.stream().filter(s->s.toUpperCase().contains("A")).forEach(s->System.out.println(s));
		
//		Count words having a particular character
		System.out.println(fruits.stream().filter(s->s.toLowerCase().contains("a")).count());
//		Print unique numbers from Array
		fruits.stream().distinct().forEach(s->System.out.println("Distinct element is "+s));
//		Sort the array
		fruits.stream().sorted().forEach(s->System.out.println("Sorted array is "+s));

	}
}
