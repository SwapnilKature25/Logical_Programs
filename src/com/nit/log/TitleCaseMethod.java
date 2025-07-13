package com.nit.log;

public class TitleCaseMethod {
	public static void main(String[] args) {
//		➤ With Predefined Method:
		String str="Java is versatile lang";
		String[] split = str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(String word : split)
		{
			sb.append(Character.toUpperCase(word.charAt(0)))
					.append(word.substring(1)).append(" ");
			
		}
		System.out.println(sb.toString().trim());
		
//		➤ Without Predefined Method:
		String result="";
		boolean capitalizeNext=true;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.toLowerCase().charAt(i);
			if(ch==' ')
			{
				result+=ch;
				capitalizeNext=true;
			} else if(capitalizeNext) {
				result+= (char)(ch-32);
				capitalizeNext=false;
			} else {
				result+=ch;
			}
		}
		
		System.out.println(result);
		
	
	}
}
