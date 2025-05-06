package com.nit.logical.string;

public class ImmutableStrings {

	public static void main(String[] args) {
		String str="Java";
		System.out.println(str.hashCode());
		str = str.concat(" Rules");
		System.out.println(str);
		System.out.println(str.hashCode());
		
		String s1=new String("Java");
		String s2=s1.toUpperCase();
		
		System.out.println(s1+ ", "+s1.hashCode());
		System.out.println(s2+", "+s2.hashCode());
		
	}

}
