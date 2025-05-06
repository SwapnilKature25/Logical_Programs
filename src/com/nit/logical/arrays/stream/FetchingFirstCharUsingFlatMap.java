package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FetchingFirstCharUsingFlatMap {

	public static void main(String[] args) {
		List<String> listOfNames = Arrays.asList("Java","Aryan","Virat","Aakash");
//	    List<Character> list = listOfNames.stream().flatMap(str -> Stream.of(str.charAt(0))).toList();	
//	    System.out.println(list);
	    List<Character> list = listOfNames.stream().map(str -> str.charAt(0)).toList();	
	    System.out.println(list);
	
	    
	
	}

}
