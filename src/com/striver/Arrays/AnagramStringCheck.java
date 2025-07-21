package com.striver.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Write a program to check if the strings are Anagrams?
public class AnagramStringCheck {
	
	public static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) return false;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str1=sc.nextLine();
		System.out.println("Enter the second string : ");
		String str2=sc.nextLine();
		
		if(isAnagram(str1, str2)) {
			System.out.println("Ths Strings are anagrams");
		}
		else {
			System.out.println("Ths Strings are not anagrams");			
		}	
	}
}
/*
Enter the first string : 
tac
Enter the second string : 
act
Ths Strings are anagrams
*/