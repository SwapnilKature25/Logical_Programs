package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class FIndCubeUsingMap {

	public static void main(String[] args) {
		double arr[]= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		double[] array = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.map(num -> Math.pow(num, 3))
				.toArray();
		System.out.println(Arrays.toString(array));
	}

}
