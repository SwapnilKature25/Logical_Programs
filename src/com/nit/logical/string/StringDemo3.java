package com.nit.logical.string;

public class StringDemo3 {

	public static void main(String[] args) {
		// following are the ways to put the string into SCP
		String s1 = "Database";
		String s2 = new String("Hyderabad").intern();
		String s3 = "Data"+ "base";
		String s4 = String.valueOf("Database");
		
		System.out.println(s1==s4); // true
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //true
		System.out.println(s3==s4); //true
	}
}
