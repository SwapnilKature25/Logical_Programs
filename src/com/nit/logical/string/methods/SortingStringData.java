package com.nit.logical.string.methods;

import java.util.Arrays;
import java.util.Scanner;

public class SortingStringData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(ch[i] > ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
//		System.out.println(ch);
		System.out.println(new String(ch));
	}

}
