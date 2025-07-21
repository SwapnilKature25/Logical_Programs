package com.nit.ArraysAndStrings;

import java.util.HashSet;

// 
public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[]= {1,2,1,2,3,4,3,5};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(Integer i:arr) {
			set.add(i);
		}
		
		System.out.println(set);
	}

}
