package com.striver.Arrays;

import java.util.Arrays;
import java.util.Vector;

public class MovesZeroToEnd {

	public static void main(String[] args) {
		int arr[]= {1,0,2,3,2,0,0,4,5,1};
		int n=arr.length;
//		Brute approach
		// step 1
		Vector<Integer> temp=new Vector<>();
		for (Integer i : arr) {
			if(arr[i]!=0) {
				temp.add(i);
			}
		}
		System.out.println(temp);
		// step 2
		for(int i=0; i<temp.size(); i++) {
			for(Integer t:temp) {
				arr[t]=t;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
