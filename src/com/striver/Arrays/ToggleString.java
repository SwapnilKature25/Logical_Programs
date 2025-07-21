package com.striver.Arrays;

import java.util.Arrays;

// A String is given.Our task is to write a java program to toggle the characters of the given string.For example, for the string “StRinG”, the string after the toggle will be “sTrINg”.
public class ToggleString {
	public static void main(String[] args) {
		String str="StRinG";
		System.out.println(str);
		StringBuilder str2=new StringBuilder();
		char[] ch=str.toCharArray();
		int len=ch.length;
		
		for(int i=0; i<len; i++)
		{
			char c=ch[i];
			if(Character.isUpperCase(c)) {
				str2.append(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c)) {
				str2.append(Character.toUpperCase(c));
			}
			else {
				str2.append(c);
			}	
		}
		System.out.println(str2);
	}
}
