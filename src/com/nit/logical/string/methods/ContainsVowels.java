package com.nit.logical.string.methods;

import java.util.Scanner;

public class ContainsVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		boolean  containsVowel=false;
		
		for(char c : str.toLowerCase().toCharArray())
		{
			if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u')
			{
				containsVowel = true;
				break;
			}
		}
		
		if(containsVowel)
			System.out.println("The string contains a vowel ");
		else 
			System.out.println("The string does'nt contains a vowel ");
	}

}
