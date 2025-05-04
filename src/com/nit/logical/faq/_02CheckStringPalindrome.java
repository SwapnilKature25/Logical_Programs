package com.nit.logical.faq;

public class _02CheckStringPalindrome {
	public static void main(String[] args) {
		String str="madam";
		String reversed="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reversed+=str.charAt(i);
		}
		
		System.out.println("Is Palindrome : "+str.equals(reversed));
		
	}
}
