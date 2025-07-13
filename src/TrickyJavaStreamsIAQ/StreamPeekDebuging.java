package TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;

//How to debug streams using peek()?
public class StreamPeekDebuging {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","banana","avocado","bluberry");
		System.out.println(fruits);
		System.out.println("======================");
		List<String> result = fruits.stream()
			.peek((word)-> System.out.println("Original : "+word))
			.filter( str -> str.startsWith("a"))
			.peek((word) -> System.out.println("After filter : "+word))
			.map( str -> str.toUpperCase())
			.peek( word -> System.out.println("After map : "+word))
			.toList();
		System.out.println("Final result : "+result);
		
	}

} 

/*
[apple, banana, avocado, bluberry]
======================
Original : apple
After filter : apple
After map : APPLE
Original : banana
Original : avocado
After filter : avocado
After map : AVOCADO
Original : bluberry
Final result : [APPLE, AVOCADO]


*/