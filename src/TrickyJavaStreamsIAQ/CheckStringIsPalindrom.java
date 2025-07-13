package TrickyJavaStreamsIAQ;

import java.util.stream.IntStream;
// Check Given string is palindrome or not using stream?

public class CheckStringIsPalindrom {

	public static void main(String[] args) {
//		Using java 7 concepts
//		String input="mjadam";
//		int length = input.length();
//		
//		for(int i=0; i<length/2; i++)
//		{
////			m != m
//			if(input.charAt(i) != input.charAt(length-1-i)) {
//				System.out.println(input+" is not a palindrome");  // mjadam is not a palindrome
//				return;
//			}
//		}
//		
//		System.out.println(input+" is a palindrome");

		
//		Using java 8
		String str="madam";
		
		boolean allMatch = IntStream.range(0, str.length()/2)
				.allMatch( i -> str.charAt(i) == str.charAt(str.length()-1-i));
		System.out.println("Is "+str+" a palindrome : "+allMatch);   // Is madam a palindrome : true

	} 

}
