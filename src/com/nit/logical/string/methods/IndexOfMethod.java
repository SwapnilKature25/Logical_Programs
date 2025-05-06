package com.nit.logical.string.methods;

public class IndexOfMethod {

	public static void main(String[] args) {
		//IndexOf()
		String str="Java is Best Language";
		int index=str.indexOf("is");
		System.out.println(index);
		
		int lastIndex=str.lastIndexOf("e");
		System.out.println(lastIndex);
		
		String str2=" Tata Company ";
		System.out.println(str2.trim());
	}

}
