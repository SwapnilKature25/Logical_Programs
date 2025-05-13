package com.nit.logical.faq;

import java.util.Scanner;

public class Array_OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no ");
		int number=sc.nextInt();
		
		if(number%2==0)
			System.out.println(number+" is even no.");
		else
			System.out.println(number+" is odd no.");
		
		
	}

}
