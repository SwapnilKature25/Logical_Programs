package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.Collections;

public class DistinctSortedDemo {

	public static void main(String[] args) {
		int arr[]= {50,30,40,10,30};
		int[] array = Arrays.stream(arr).distinct().sorted().toArray();
		System.out.println(Arrays.toString(array));
	
	
		int arr2[]= {50,30,40,10,30};
		int[] array2 = Arrays.stream(arr2).distinct().sorted().toArray();
		System.out.println(Arrays.toString(array2));
	
	}

}
