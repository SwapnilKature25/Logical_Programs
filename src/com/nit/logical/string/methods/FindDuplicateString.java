package com.nit.logical.string.methods;

import java.util.Scanner;

public class FindDuplicateString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		int count=0;
		char[] ch=str.toCharArray();
		
		System.out.println("Duplicate Characters are : ");
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]+" ");
					count++;
					break;
				}
			}
		}
		System.out.println("\nTotal duplicate characters are : "+count);
	}

}
