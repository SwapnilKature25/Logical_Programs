package com.nit.logical.faq;

public class _03CountVowelsConsonants {

	public static void main(String[] args) {
		String str="Hello world";
		int vowels=0, cons=0;
		
		str=str.toLowerCase();
		System.out.println(str);
		char[] vowel= {'a','e','i','o','u'};
		// 1st way
//		for(int i=0; i<str.length()-1; i++)
//		{
//			char ch=str.charAt(i);
//			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
//			{
//				vowels++;
//			}
//			else
//				cons++;
//		
//		}
		
		
		// 2nd way
		for(char c : str.toCharArray())
		{
			if(c>='a' && c<='z')
			{
				if("aeiou".indexOf(c)!=-1)
				{
					vowels++;
				}
				else 
					cons++;
			}
		}
		
		System.out.println("Vowels : "+vowels +", Consonants : "+cons);
	}

}
