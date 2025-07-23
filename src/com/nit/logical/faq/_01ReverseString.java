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
		
		System.out.println();
		
		 	String str2 = "hello";
	        char[] chars = str2.toCharArray();
	        
	        int left = 0, right = chars.length - 1;
	        while (left < right) {
	            // Swap characters
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;

	            left++;
	            right--;
	        }

	        System.out.println("Reversed: " + new String(chars));
	}
}
