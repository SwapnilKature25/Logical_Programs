package com.nit.logical.string.methods;

public class StringConcatDemo1 {

	public static void main(String[] args) {
		String s1 = "Data";
		String s2 = "base";
		
		String concat = s1.concat(s2);  // Database
		System.out.println("String after Concatenation is :"+concat);
		
		System.out.println("====================");
		
		String s3="Hyderabad is an";
		concat = s3.concat(" it City");  // Hyd.....
		System.out.println("String after Concatenation is :"+concat);
		
		System.out.println("====================");
		
		String s4 = "Java is ";
		String s5 = "a great Programming language";
		concat = s4 + s5;
		System.out.println("String after Concatenation is :"+concat);
		
		
	}

}
