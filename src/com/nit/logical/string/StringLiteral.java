package com.nit.logical.string;

public class StringLiteral {

	public static void main(String[] args) {
		String s1="India";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1=null;
		System.gc();
		System.out.println(s1);
		
		String s2="India";
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		
	}

}
