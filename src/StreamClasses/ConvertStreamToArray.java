package StreamClasses;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ConvertStreamToArray {

	public static void main(String[] args) {
		
		List<String> techUsedList = Stream.of("Node","SQL","Python","Java","Javascript","Karate")
				.collect(Collectors.toList());
		techUsedList.forEach(s-> System.out.println(s));
	}
}
