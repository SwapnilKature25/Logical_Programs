package com.nit.logical.faq;

public class Array_Factorial {
	public static void main(String[] args) {
		
		int n=4;
		int fact=1;
		
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;  // 4*3*2*1 = 24
		}
		
		System.out.println(n+" Factorial is : "+fact);
	}
}
