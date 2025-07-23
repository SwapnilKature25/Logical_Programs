package com.nit.logical.faq;

public class _02CheckStringPalindrome {
	public static void main(String[] args) {
		// 1
		String str="madam";
		String reversed="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reversed+=str.charAt(i);
		}
		
		System.out.println("Is Palindrome : "+str.equals(reversed));
		
		System.out.println();

		// 2
		 String str2 = "madam";
	        char[] chars = str2.toCharArray();

	        int left = 0, right = chars.length - 1;
	        boolean isPalindrome = true;

	        while (left < right) {
	            if (chars[left] != chars[right]) {
	                isPalindrome = false;
	                break;
	            }
	            left++;
	            right--;
	        }
	        System.out.println("Is Palindrome: " + isPalindrome);
	}
}
