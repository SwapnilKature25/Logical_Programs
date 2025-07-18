package com.nit.All;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=5;
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=1; i<=num; i++) {
			System.out.print(a+" ");
			a=b;
			b=c;
			c=a+b;
		}
		 
		System.out.println("\n=============================");
		int seqLength = 10;

	     System.out.print("A Fibonacci sequence of " + seqLength + " numbers: \n");

	     for (int i = 0; i < seqLength; i++) {
	           System.out.print(fibonacci(i) + " ");
	     }
		
	}
	
	
	public static int fibonacci(int count) {
		if (count <= 1)
			return count;
//		F(N) = F(N-1) + F(N-2) 
		return fibonacci(count - 1) + fibonacci(count - 2);
	}

}
