package com.nit.logical.arrays.stream;

import java.util.stream.Stream;

public class Stream_ofMethod {
	public static void main(String[] args) {
		Stream<Integer> streamOfInteger = Stream.of(1,2,3,4,5,6);
		streamOfInteger.forEach(System.out::println);
	
		Stream<String> streamOfString = Stream.of("A","B","C","D");
		streamOfString.forEach(System.out::println);
	}
}	
