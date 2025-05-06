package com.nit.logical.string.methods;

public class StringToByteArray {
// convert string into byte array
	public static void main(String[] args) {
		String str="ABCDEF";
		byte[] bytes = str.getBytes();
		
		for(byte b : bytes)
		{
			System.out.println(b);
		}
	}

}
