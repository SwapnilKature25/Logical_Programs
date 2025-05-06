package com.nit.logical.string.methods;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to reverse : ");
		String str=sc.nextLine();
		System.out.println("Using String : ");
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		// Using StringBuilder
		
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		System.out.println("Using StringBuilder : "+sb.reverse());
		
	}
}
