package com.striver.Arrays;

// Function to count occurrences of digit D in number N
public class CountDigitOccurrences {

	public static void main(String[] args) {
		int num=2535534;
		int d=5;
		int count = countOccurance(d, num);
		System.out.println("Digit : "+d+" occurs "+count+" times in "+ num);
	}
	
	public static int countOccurance(int D, int N) {
		int count=0;
		while(N>0) {
			if(N%10==D) {
				count++;
			}
			N/=10;
		}
		return count;		
	}
}
