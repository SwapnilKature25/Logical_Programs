package com.nit.logical.string.methods;

import java.util.Scanner;

public class ContainsDigitOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		boolean containsDigits=false;
		
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				containsDigits=true;
				break;
			}
		}
		
		if(containsDigits)
			System.out.println("The String contains digits");
		else 
			System.out.println("The String does not contains digits");
		
	}

}
