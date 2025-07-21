package com.nit.TrickyJavaStreamsIAQ;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

// Given a String, find the first non-repeated character in it using Stream functions?
public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		 String input="swiss";
		 
//		 LinkedHashMap => order of insertion is managed but for hashMap and HashSet insertion order is not managed
//		 input.chars().forEach(System.out::println);
		 input.chars()
		 	.mapToObj(ch -> (char)ch) // converting back to character
		 	.collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new,Collectors.counting()))
		 	.entrySet()
		 	.stream()
		 	.filter(entry -> entry.getValue()==1)   // Filters out the repeated characters, leaving only characters with a count of 1 (non-repeated).
		 	.map(entry -> entry.getKey())
//		 	.skip(1)  // for finding 2nd non-repeating character
		 	.findFirst()
		 	.ifPresent(System.out::println);   // w

	}
}
