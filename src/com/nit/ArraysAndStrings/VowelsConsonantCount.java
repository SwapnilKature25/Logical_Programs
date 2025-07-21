package com.nit.ArraysAndStrings;

public class VowelsConsonantCount {

	public static void main(String[] args) {
		String str="Automation";
		int vowels=0, consonants=0;
		for(char ch:str.toCharArray()) {
			if("aeiouAEIOU".indexOf(ch)!=-1) {
				vowels++;
			} else if(Character.isLetter(ch)) {
				consonants++;
			}
		}
		System.out.println("Vowels : "+vowels+", Consonants : "+consonants);
	}
}
