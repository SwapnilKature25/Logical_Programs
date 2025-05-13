package com.nit.logical.faq;

public class Array_SumOfAllDigits {

	public static void main(String[] args) {
		int n=1234;
		int rem=0,sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		
		System.out.println("Sum of digits : "+sum); // 10
		
	}

}
