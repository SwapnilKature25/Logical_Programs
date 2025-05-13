package com.nit.logical.faq;

import java.util.Scanner;
import java.util.stream.Stream;

public class Array_FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no ");
		int number=sc.nextInt();
//		series = 0 1 1 2 3 5 8
		int a=0,b=1,c=0;
		for(int i=0; i<number; i++)
		{
			
			System.out.print(a+" "); // 0  1  1  2  3
			c=a+b; // c=0+1=1  , c=1+1=2, c=1+2=3, c=2+3=5
			a=b; // a=1  , a=1  , a=2  , a=3
			b=c; // b=1  , b=2  , b=3  , b=
			
		}
		
		System.out.println();
		 
		
//		✅ 1. Recursive Approach (No variables, prints directly)
/*		public static void main(String[] args) {
	        printFibonacci(0, 1, 10); // First two numbers and how many terms
	    }

	    static void printFibonacci(int a, int b, int n) {
	        if (n > 0) {
	            System.out.print(a + " ");
	            printFibonacci(b, a + b, n - 1);
	        }
	    }
*/
		
		
//		✅ 2. Using Java 8+ Streams (no explicit variables)
		Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
        .limit(10)
        .forEach(f -> System.out.print(f[0] + " "));
		

		
	}

}
