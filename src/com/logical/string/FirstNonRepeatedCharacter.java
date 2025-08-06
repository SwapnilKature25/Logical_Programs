package com.logical.string;

public class FirstNonRepeatedCharacter {

	public static String firstNonRepeatingChar(String str) {
		String result="";
		
		for(int i=0; i<str.length(); i++) {
			int count=0;
			if(str.charAt(i)!=' ') { 
				
				for(int j=0; j<str.length(); j++) {
					if(str.charAt(i)==str.charAt(j) && i!=j) {  // S==S && s!=s , S==o && s!=o
						count++;   // c=1
						break;
					}
				}
				
				if(count==0) {
					result+=str.charAt(i);
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str="Software Services";
//		first Non Repeating Char : o
		System.out.println("first Non Repeating Char : "+firstNonRepeatingChar(str));
	}
}
/*
for each character at i in string:
   if it's not a space:
      set count = 0
      for each character at j in string:
         if i != j and char at i == char at j:
            count++
            break
      if count == 0:
         return char at i

*/
