package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;
//Find all the numbers starting with 1 using streams?
public class NumberStartingWithOne {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,12,21,3,21,13,1);
		
//		1st  - first convert to string
		List<Integer> numbersStartingWithOne = numbers.stream()
//									.filter(num -> !String.valueOf(num).startsWith("1"))    // it will return numbers which are not  starting with 1
									.filter(num -> String.valueOf(num).startsWith("1"))   
									.toList();
		numbersStartingWithOne.forEach(System.out::println);     // 10 12 13 1
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
//		2nd 
		List<Integer> numbersStartingOne = numbers.stream()
						// converting number to string
				.filter(num -> (""+num).startsWith("1"))   // 10 12 13 1
				.toList();
numbersStartingWithOne.forEach(System.out::println);
	
	}
}
