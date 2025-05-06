package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class MapDemo1 {
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		
		int[] array = Arrays.stream(arr).map(num -> num+5).toArray();
		System.out.println(Arrays.toString(array));
	}
}
