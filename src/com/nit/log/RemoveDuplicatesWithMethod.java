package com.nit.log;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWithMethod {
	
	public static void main(String[] args) {
//		With predefined method
		String str="lala guages";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(char c: str.toCharArray()) {
			set.add(c);
		}
		set.forEach(System.out::print);
		System.out.println();
		
//		Without predefined method
		String result="";
		for(int i=0; i<str.length(); i++)  // 0,1,2
		{
			char ch=str.charAt(i);  // l a l
			boolean found=false;
			for(int j=0; j<i; j++)  // 0 < 1, 0<2
			{
				if(str.charAt(j)==ch)  // l==a, l==l
				{
					found=true;   // l
					break;
				}
			}
			
			if(!found) result+=ch;  // ""+l = l+a=la
		}
		System.out.println(result);  // L
		
		
		
	}
	
}
