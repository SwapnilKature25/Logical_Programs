package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntStreamMethods {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int sum = Arrays.stream(arr).sum();
		System.out.println("Sum of all array elements : "+sum);
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("Minimum elements is : ");
		min.ifPresent(System.out::println);
		
		OptionalInt max = Arrays.stream(arr).max();
		max.ifPresent(System.out::println);
		
		OptionalDouble average = Arrays.stream(arr).average();
		average.ifPresent(System.out::println);
		
		long count = Arrays.stream(arr).count();
		System.out.println("Total no of ele : "+count);
	}

}
