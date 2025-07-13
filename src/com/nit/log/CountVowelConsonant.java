package com.nit.log;

public class CountVowelConsonant {
	public static void main(String[] args) {
//		With predefined method
		String str="Java Programming";
		int vowels=0, consonants=0;
		for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
		System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
   
        
        
//		Without predefined method
        vowels=0;
        consonants=0;
        for(int i=0; i<str.length();i++)
        {
        	char ch=Character.toLowerCase(str.charAt(i));
        	if( (ch>='a' && ch<='z'))
        	{
        		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        		{
        			vowels++;
        		}
        		else {
        			consonants++;
        		}
        	}
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
        
	}
}
