package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RetrieveEvenNoIntStream {
	public static void main(String[] args) {
		int arr[]= {10,15,20,30,40,05};
		IntStream stream = Arrays.stream(arr);
		int[] array = stream.filter(num -> num%2==0).toArray();
		System.out.println(Arrays.toString(array));
	}
}
