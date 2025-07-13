package com.nit.log;

public class CheckPalindrome {
	public static void main(String[] args) {
//		With predefined method
		String str1="madam";
		String str2=new StringBuilder(str1).reverse().toString();
		System.out.println(str1 + " is a palindrome "+str1.equals(str2));  // true
	
//		Without predefined method
		boolean isPalindrome=true;
		for(int i=0; i<str1.length()/2; i++)
		{
			if(str1.charAt(i)!=str1.charAt(str1.length()-1-i))
			{
				isPalindrome=false;
				break;
			}
		}
		System.out.println(str1+" is a palindrome : "+isPalindrome);  // true
	
	}
}
