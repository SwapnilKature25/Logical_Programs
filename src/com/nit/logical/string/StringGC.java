package com.nit.logical.string;

// WAP that describs Objects created by using literal
//or new keyword are not eligible for garbage collector.
public class StringGC {

	public static void main(String[] args) throws InterruptedException {
		String s1="India";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 = null;
		System.gc();
		
		Thread.sleep(5000);

		String s2 = "India";
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
	}

}
