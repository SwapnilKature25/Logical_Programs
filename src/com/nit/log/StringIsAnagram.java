package com.nit.log;

import java.util.Arrays;

//  Check if Two Strings are Anagrams
//(Anagram: Same letters, different order)
public class StringIsAnagram {

	public static void main(String[] args) {
//		With predefined method
		String s1="listen", s2="silent";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(s1+" and "+s2 + " are Anagrams : "+Arrays.equals(c1, c2));
		
		
//		Without predefined method
		if(s1.length() != s2.length())
		{
			System.out.println(false);
			return;
		}
		
		int[] freq=new int[26];
		for(int i=0; i<s1.length(); i++) {
			freq[s1.charAt(i)-'a']++;   // l
			freq[s2.charAt(i)-'a']--;
		}
		
		for(int val:freq)
		{
			if(val!=0)
			{
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
		
	}

}
