package com.nit.logical.faq;

public class Array_SwapNum {
	public static void main(String[] args) {
		int a=4,b=5;
		System.out.println("Before Swapping : "+a+" "+b);
		
		a=a+b;  // 9
		b=a-b;  // 4
		a=a-b;  // 5
		
		System.out.println("After Swapping : "+a+" "+b);
		
	}
}
