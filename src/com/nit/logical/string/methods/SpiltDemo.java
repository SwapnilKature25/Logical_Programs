package com.nit.logical.string.methods;

public class SpiltDemo {
	public static void main(String[] args) {
		String  str="Hyderabad is a nice city"
				;
		String words[]=str.split("");
		
		for(String word: words)
		{
			System.out.println(word);
		}
		
		words = str.split("e");
		
		for (String word : words) {
			System.out.println(word);
		}
		
	}
}
