package com.logical.string;

public class ReverseString {

	public static void main(String[] args) {
		String str="John";
		// 1
		reverseStr(str);
		
		System.out.println("===============");
		// 2
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println("\n===============");
		// 3
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println("Reverse Of "+str+" is "+sb);
		
	}
	
	public static void reverseStr(String str) {
		char[] ch=str.toCharArray();
		String reversed="";
		for(int i=ch.length-1; i>=0; i--) {
			reversed+=ch[i];
		}
		
		System.out.println("Reverse Of "+str+" is "+reversed);
	}

}


/*
Reverse Of John is nhoJ
===============
nhoJ
===============
Reverse Of John is nhoJ

*/