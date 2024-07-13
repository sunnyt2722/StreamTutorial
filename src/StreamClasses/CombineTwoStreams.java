package StreamClasses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class CombineTwoStreams {
	public static void main(String[] args) {
		List<String> marvelHeros = Arrays.asList("IronMan","Hulk","Black Widow","Thor","Captain America","Spiderman");
		List<String> dcHeros = Arrays.asList("Superman","Batman","Aquaman","Flash","Green Arrow","Wonder Women");
		
		Stream<String> allHeros = Stream.concat(marvelHeros.stream(), dcHeros.stream());
		allHeros.sorted().forEach(s->System.out.println(s));
		
	}

}
