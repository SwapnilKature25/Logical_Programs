package com.nit.logical.string;

public class StringEquals {
	public static void main(String[] args) {
		String s1="Java";
		String s2=new String("Java");
		
		System.out.println(s1==s2);  // false
		System.out.println(s1.equals(s2));  // true
		System.out.println(s1.hashCode()+ " : "+s2.hashCode());  // same
		
	}
}
