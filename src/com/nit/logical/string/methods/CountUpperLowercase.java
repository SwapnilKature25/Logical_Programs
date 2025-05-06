package com.nit.logical.string.methods;

import java.util.Scanner;
//  Character.isUpperCase(str.charAt(i)  
//  Character.isLowerCase(str.charAt(i)
public class CountUpperLowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		int uppercase=0, lowercase=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
				uppercase++;
			else
				lowercase++;
		}
		
		System.out.println("Uppercase letters : "+uppercase);
		System.out.println("Lowercase letters : "+lowercase);
		
	}

}
