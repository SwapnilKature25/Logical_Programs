package com.nit.log;

import java.util.HashMap;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
//		With predefined method
		String str="hello";
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);   // {e=1, h=1, l=2, o=1}

		
//		Without predefined method
		for(int i=0; i<str.length(); i++) 
		{
			char ch=str.charAt(i);	// h  l=2
			int count=0;
			boolean alreadyCounted=false; 
			for(int k=0; k<i; k++)       //  0<2
			{ 
				if(str.charAt(k)==ch)    // h==l, e==l
				{
					alreadyCounted=true;
					break;
				}
			}
			
			if(!alreadyCounted)
			{
				for(int j=0; j<str.length(); j++)  // j<5  // j<5
				{
					if(str.charAt(j)==ch)  // h==h   // h==l, e==l, l==l, l==l, o==l
					{
						count++;   // h=1   // l=2
					}
				}
				System.out.println(ch+" : "+count);  // h : 1  // l : 2
			}
		}
		
		
		
	}
}
