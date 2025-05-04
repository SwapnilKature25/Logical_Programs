package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class RetrieveFromArray {

	public static void main(String[] args) {
		String cities[] = {"Hyd","Pune","Mumbai","Haryana"};
		Object[] array = Arrays.stream(cities).filter(str -> str.startsWith("H")).toArray();
		System.out.println(Arrays.toString(array));
	
	}

}
