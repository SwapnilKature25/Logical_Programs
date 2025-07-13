package com.nit.log.array;

public class CheckPrime {
	public static void main(String[] args) {
		int n=12;
		System.out.println(n+" is a prime number or not : "+isPrime(n));
	}
	
	public static boolean isPrime(int num)
	{
		if(num<=1) return false;
		for(int i=2; i<Math.sqrt(num); i++)
		{
			if(num%i==0) return false;
		}
		return true;
	}
 }
