package com.nit.logical.faq;

public class Array_PalindromeNum {

	public static void main(String[] args) {
		int n=132,num;
		int rev=0,rem;
		num=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		if(num==rev)  // 132==132
			System.out.println(num +" is an Palindrome number");
		else
			System.out.println(num +" is not an Palindrome number");
		
	}

}
