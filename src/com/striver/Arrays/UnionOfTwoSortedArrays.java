package com.striver.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Unions of two sorted arrays 
public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,5};
		int arr2[]= {1,2,3,4,5,6};
		
		System.out.println("First array : "+Arrays.toString(arr1));
		System.out.println("Second array : "+Arrays.toString(arr2));
		
		Set<Integer> st=new HashSet<>();
		for (Integer i : arr1) {
			st.add(i);
		}
		
		for (Integer i : arr2) {
			st.add(i);
		}
		
		int union[]=new int[st.size()];
		int i=0;
		for (Integer num : st) {
			union[i++]= num;
		}
		
		System.out.println("Union array : "+Arrays.toString(union));
		
		
	}

}
