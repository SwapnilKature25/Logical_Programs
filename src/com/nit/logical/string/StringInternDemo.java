package com.nit.logical.string;

public class StringInternDemo {

	public static void main(String[] args) {
		String st1="India";
		String st2=new String("India");
		
		System.out.println(st1==st2);
		
		st2=st2.intern();
		System.out.println(st1==st2);
	
		
	}

}
