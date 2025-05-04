package com.nit.logical.faq;

public class _01ReverseString {
	public static void main(String[] args) {
		String str="Hello";
		String reversed="";
		System.out.println("Original string is : "+str);
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reversed+=str.charAt(i);
		}
		
		System.out.println("Reversed string is : "+reversed);
	}
}
