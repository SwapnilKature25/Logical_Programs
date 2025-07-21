package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;

// Find the sum of the unique numbers in a given list?
public class SumOfUniqueNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,2,3,5,6,7);
		
		int sum = numbers.stream()
				.distinct()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of unique numbers : "+sum);
	}
}
