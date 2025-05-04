package com.nit.logical.string;

// After modification in SCP (String constant pool) ,string object will be created in a different memory location

public class StringDemo2 {

	public static void main(String[] args) {
		String s1= new String("Java");
		String s2= s1.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
