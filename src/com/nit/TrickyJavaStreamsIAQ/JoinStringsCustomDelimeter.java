package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Given a list of strings, join the strings with ‘[’ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class JoinStringsCustomDelimeter {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","cherry");
		
		String collect = words.stream()
			.map(word -> "["+word+"]")
			.collect(Collectors.joining(","));
		 
		System.out.println(collect);  // 		[apple],[banana],[cherry]
		
		String collect2 = words.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(collect2);  // 	[apple,banana,cherry]
	}
}
