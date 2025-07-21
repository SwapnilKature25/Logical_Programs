package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Find the sum of the first two numbers in a given list?
public class SumOfFirstTwoNumbers {

	public static void main(String[] args) {
		
		List<Integer> num= Arrays.asList(10,20,30,40,50);
 		int sumOfFirstTwoNum = num.stream()
			.limit(2)
			.mapToInt(Integer::intValue)
			.sum();
		System.out.println("Sum of first two numbers : "+sumOfFirstTwoNum);

		System.out.println();
		// multiplication using reduce()
		Optional<Integer> multi = num.stream()
		.limit(2)
		.reduce((a,b)->a*b);
		
		multi.ifPresent(System.out::println);
	}
}
