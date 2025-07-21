package com.nit.ArraysAndStrings;

public class Fibonacci {

	public static void main(String[] args) {
		int n=5;
		int a=0,b=1,c=0;
		for(int i=0; i<n; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
