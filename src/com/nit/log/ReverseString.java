package com.nit.log;

public class ReverseString {

	public static void main(String[] args) {

//		With predefined method
		String str="abc";
		StringBuilder sb=new StringBuilder(str);
		System.out.println("Reverse string value with predefined methods");
		System.out.println(sb.reverse());
	
//		Without predefined method
		char[] ch=str.toCharArray();
		int j=ch.length - 1;
		for(int i=0; i<j; i++,j--)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println("Reverse string value without predefined methods");
		System.out.print(new String(ch));
		
		
	}

}
