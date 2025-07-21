package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
// How to do you get last element of an array
public class LastElementOfArray {

	public static void main(String[] args) {
		int arr[]= {12,11,23,14,15};
		System.out.println(arr.length); // 5
		Arrays.stream(arr).skip(arr.length-1).findFirst().ifPresent(System.out::println);		
	}
}
