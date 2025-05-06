package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class CountOccurencesOfEle {

	public static void main(String[] args) {
		int[] num = {11,21,32,11,23,32,33,11,21,23,21,11};
		int target=11;
		
		long count = Arrays.stream(num)
			.filter(n -> n==target)
			.count();
		
		System.out.println("The number "+target+" appears "+count+" times");
	}

}
