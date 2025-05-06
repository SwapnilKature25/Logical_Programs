package com.nit.logical.string.methods;

import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		System.out.println("Enter a character to search : ");
		char target=sc.next().toLowerCase().charAt(0);
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==target)
			{
				count++;
			}
		}
		
		System.out.println("The Character "+target+" appears "+count+" times in the string "+str);
	}

}
