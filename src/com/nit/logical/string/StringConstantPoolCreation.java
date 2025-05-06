package com.nit.logical.string;

public class StringConstantPoolCreation {

	public static void main(String[] args) {
		String s1="Database";
		String s2=new String("Database").intern();
		String s3="Data"+"base";
		String s4=String.valueOf("Database");
		
		System.out.println(s1==s4);  // true
		System.out.println(s1==s3);  // true
		System.out.println(s1==s2);  // true
	}

}
