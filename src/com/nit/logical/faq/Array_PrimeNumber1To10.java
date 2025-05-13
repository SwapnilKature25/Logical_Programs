package com.nit.logical.faq;

import java.util.Arrays;

public class Array_PrimeNumber1To10 {
	public static void main(String[] args) {
		int []arr=new int[10];
		int index=0;
		for(int i=2; i<=10; i++)
		{
			int c=2;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2) {
				arr[index++]=i;
			}
				
		}
		System.out.println(Arrays.toString(arr)); // [2, 3, 5, 7, 0, 0, 0, 0, 0]

		// Create a trimmed array
        int[] primes = Arrays.copyOf(arr, index);  // [2, 3, 5, 7]
        System.out.println(Arrays.toString(primes));
	}
}
