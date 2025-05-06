package com.nit.logical.string.methods;

import java.util.Scanner;

public class CountConsonantsVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		int cons=0, vowel=0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				vowel++;
			else 
				cons++;
		}
		
		System.out.println("Vowels : "+vowel);
		System.out.println("Consonants : "+cons);
	}

}
