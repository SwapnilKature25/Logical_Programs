package com.striver.Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

// Remove Duplicates from a sorted array.
public class RemoveDuplicateArrayEle {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,2,3,3};
//		1st Brute approach  TC : N logN + N   SC : O(N)
 		int n = arr.length;
//		(LinkedHashSet is used to preserve insertion order, which is helpful here since the array is sorted.)
		Set<Integer> st=new LinkedHashSet<>();
		for(int i=0; i<n; i++) {
			st.add(arr[i]);
		}
		// complexity : N
		int index=0;
		for(Integer it : st) {
			arr[index]=it;
			index++;
		}
		System.out.println(st);  // [1, 2, 3]
	
		System.out.println("++++++++++++++++++++++++++++++++");
		
//		Optimal approach   TC : O(N)  & SC : O(1)
		int arr2[]= {1,1,2,2,2,3,3};
		System.out.println("Array length before removing duplicates : "+arr2.length); // 7
		int newLength = removeDuplicates(arr2);
		System.out.println("Array length after removing duplicates : "+newLength);  // 3
		
		int[] uniqueArr = Arrays.copyOf(arr2, newLength);
		System.out.println(Arrays.toString(uniqueArr));  // [1, 2, 3]

			
	}
	
	public static int removeDuplicates(int arr2[]) {
//		Optimal approach 
		int i=0;
		int n=arr2.length;
		for(int j=1; j<n; j++) {
			if(arr2[i]!=arr2[j]) {
				arr2[i+1]=arr2[j];
				i++;
			}
		}
		return i+1;   //  Total number of unique elements
	}
}
