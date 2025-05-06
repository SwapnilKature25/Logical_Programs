package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class ReplaceNegtveNo {

	public static void main(String[] args) {
		int arr[]= {-9,23,-1,34,54,-3,2};
		
		int[] array = Arrays.stream(arr)
//			.filter(num -> num<0)  // no need
			.map(num -> (num<0)? 0 : num)
			.toArray();
		System.out.println(Arrays.toString(array));

	}
	

}
