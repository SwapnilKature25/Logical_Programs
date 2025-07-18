package com.nit.All;

public class ReverseString {

	public static void main(String[] args) {
		String str="abc";
		char[] chars = str.toCharArray();
		for(int i=chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);  // cba
		}
	}

}
