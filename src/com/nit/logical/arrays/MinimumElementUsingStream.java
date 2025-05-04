package com.nit.logical.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinimumElementUsingStream {

	public static void main(String[] args) {
		int arr[]= {4,3,2,5,6};
//		OptionalInt min = Arrays.stream(arr).min();
		OptionalInt min = Arrays.stream(arr).max();
		min.ifPresent(System.out::println);
	}

}
