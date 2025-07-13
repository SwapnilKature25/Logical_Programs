package com.nit.log.array;

public class SwapWithArithmetic {
	public static void main(String[] args) {
		int a=10, b=5;
		System.out.println("Before swapping = a : "+a+"\n b : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping = a : "+a+"\n b : "+b);
	}
}
