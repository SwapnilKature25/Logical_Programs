package com.nit.logical.string;

public class StringInternDemo2 {

	public static void main(String[] args) {
		String s1 = new String("India");
		String s2 = new String("India");
		
		System.out.println(s1==s2); //false
		
		s1=s1.intern();
		s2=s2.intern();
		System.out.println(s1==s2);  //true
	
	}

}
