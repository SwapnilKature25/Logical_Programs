package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class FindPrimeNo {
	public static void main(String[] args) {
		int num[]= {2,3,4,5,6,7,8,9,10,11};
		int[] array = Arrays.stream(num).filter(FindPrimeNo::isPrime).toArray();
		System.out.println("Prime Numbers : "+Arrays.toString(array));
	}
	
	public static boolean isPrime(int num)
	{
		if(num < 2)
		{
			return false;
		}
		for(int i=2; i<=Math.sqrt(num); i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
