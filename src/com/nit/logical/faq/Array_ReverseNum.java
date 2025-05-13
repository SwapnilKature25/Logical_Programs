package com.nit.logical.faq;

public class Array_ReverseNum {

	public static void main(String[] args) {
		int n=123;
		int rev=0,rem;
		while(n!=0)
		{ 
			rem=n%10;  // 3 , 2
			rev=rev*10+rem;  // 0+3=3  , 30+2=32, 320+1=321
			n/=10;
		}
		
		System.out.println("Reverse no. : "+rev);
	}

}
