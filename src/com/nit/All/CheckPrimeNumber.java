package com.nit.All;

import java.util.ArrayList;
import java.util.List;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		 int n=11;
		 int count=2;
		 for(int i=2; i<=n/2; i++) {
			 if(n%2==0) count++;
		 }
		 
		 if(count==2) System.out.println(n+" is a prime no.");
		 else System.out.println(n+" is not a prime no.");
		 
		 isPrime(100);
	}
	
	// from 1-100
	public static void isPrime(int num) {
		List<Integer> primeNo=new ArrayList<>();
		for(int i=2; i<=num; i++) {
			int c=2;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) c++;
			}
			if(c==2) primeNo.add(i);
		}
		
		primeNo.forEach((n)-> System.out.print(n+" "));
		System.out.println();
		System.out.println("Total prime no "+primeNo.size());
	}

}

/**
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
Total prime no 25
*/