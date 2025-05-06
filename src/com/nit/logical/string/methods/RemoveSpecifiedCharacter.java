package com.nit.logical.string.methods;

import java.util.Scanner;

public class RemoveSpecifiedCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		System.out.println("Enter a character you want to remove : ");
		char removeChar=sc.next().charAt(0);
		
		StringBuilder result=new StringBuilder();
		
		for(char c : str.toCharArray())
		{
			if(c!=removeChar)
			{
				result.append(c);
			}
		}
		
		System.out.println(result);
	}

}
