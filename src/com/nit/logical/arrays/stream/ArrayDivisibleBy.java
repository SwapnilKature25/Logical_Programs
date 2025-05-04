package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class ArrayDivisibleBy {
	public static void main(String[] args) {
		Integer[] arr= {15,20,30,45,60};
		Object[] array = Arrays.stream(arr).filter(num -> num%3==0 && num%5==0).toArray();
		System.out.println("elements divisible by 3 & 5 are : "+Arrays.toString(array));
	}
}
