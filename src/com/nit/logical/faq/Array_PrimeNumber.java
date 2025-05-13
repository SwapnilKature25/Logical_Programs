package com.nit.logical.faq;

import java.util.Scanner;

public class Array_PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no ");
		int number=sc.nextInt();
		if(isPrime(number))
			System.out.println(number+ " is a prime number");
		else
			System.out.println(number+ " is not a prime number");
	}
	
	public static boolean isPrime(int num) {
		
		int n=2;
		if(num < 0)
			return false;
		
		for(int i=2; i<Math.sqrt(num); i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	
}
