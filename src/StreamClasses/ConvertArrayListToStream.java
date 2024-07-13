package StreamClasses;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ConvertArrayListToStream {

	public static void main(String[] args) {
		ArrayList<String> programmingLang = new ArrayList<String>();
		programmingLang.add("Java");
		programmingLang.add("Python");
		programmingLang.add("NodeJS");
		programmingLang.add(".Net");
		
		Stream objStream = programmingLang.stream();
		objStream.forEach(s->System.out.println("-------"+s));
	}
	
}
