package TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

// Remove duplicates from a list and preserve the order using Java
public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","banana","apple","orange","banana");
		
//		1st way  - it will only preserve order others not
		fruits.stream().distinct().forEach(System.out::println);
		System.out.println("+++++++++++++++++++");

//		2nd way
		fruits.stream().collect(Collectors.toSet()).forEach(System.out::println);
	
		System.out.println("+++++++++++++++++++");
//		3rd way
		new HashSet<>(fruits).forEach(System.out::println);
	}
}
