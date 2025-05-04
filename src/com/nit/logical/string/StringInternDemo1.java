package com.nit.logical.string;

public class StringInternDemo1 {

	public static void main(String[] args) {
		String s1 = "India";
		String s2 = new String("India");
		
		System.out.println(s1==s2);  // false
		
		s2 =s2.intern();
		System.out.println(s1==s2);  // true
		
	}

}
