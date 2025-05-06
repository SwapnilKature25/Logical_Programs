package com.nit.logical.string.methods;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();  // madam
		System.out.println(str.length());
		boolean isPalindrome=true;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) // m!= m (5-0-1) 
			{
				isPalindrome=false;
				break;
			}
		}
		
		if(isPalindrome)
			System.out.println(str+" is a Palindrome");
		else
			System.out.println(str+" is not a Palindrome");
	}

}
