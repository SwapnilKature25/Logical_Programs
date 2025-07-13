package com.nit.log;

public class StringsContainsOnlyDigits {
	public static void main(String[] args) {
//		➤ With Predefined Method:
		String str="12k34214";
		System.out.println(str.matches("\\d+"));

//		➤ With Predefined Method:
		boolean allDigits=true;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) < '0' || str.charAt(i) > '9')
			{
				allDigits=false;
				break;
			}
		}
		
		System.out.println(str + " contains all digits : "+allDigits);
	
	}
}
