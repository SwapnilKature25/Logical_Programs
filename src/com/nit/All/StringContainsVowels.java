package com.nit.All;

public class StringContainsVowels {

	public static void main(String[] args) {
		String str="hello";
		str.toLowerCase();
		char[] chars = str.toCharArray();
		boolean flag=false;
		for(int i=0; i<chars.length; i++) {
			if(chars[i]=='a' || chars[i]=='i' || chars[i]=='e' || chars[i]=='o' || chars[i]=='u') {
				flag=true;
			} 
		}
		if(flag) {
			System.out.println(str+" contains vowels ");
		}else {
			System.out.println(str+" does not contains vowels ");				
		}
	}

}
