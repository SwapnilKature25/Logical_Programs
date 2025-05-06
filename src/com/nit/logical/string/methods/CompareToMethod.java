package com.nit.logical.string.methods;

public class CompareToMethod {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Sachin";
		String s3="Ratan";
		
		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3)); // +1
		System.out.println(s3.compareTo(s1)); // -1
		
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		String s4="Apple";
		String s5="apple";
		System.out.println(s4.compareTo(s5));  // -32
		System.out.println(s5.compareTo(s4));  // 32
		
		
		
		
	}

}
