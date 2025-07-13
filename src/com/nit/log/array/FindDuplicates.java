package com.nit.log.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
//		➤ With Predefined Method:
		int[] arr= {1,3,4,1,3,4,5};
		Set<Integer> set=new HashSet<>();
		Set<Integer> duplicates=new HashSet<>();
		for(int num : arr)
		{
			if(!set.add(num))
			{
				duplicates.add(num);
			}
		}
		System.out.println("Duplicates : "+duplicates);
		
		
//		➤ Without Predefined Method:
		for (int i = 0; i < arr.length; i++) {
            boolean seenBefore = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    seenBefore = true;
                    break;
                }
            }

            if (seenBefore) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
		
	}

}
