package com.striver.Arrays;

// WAP for finding the index of the first as well as the last occurrence of an element in the array using linear time without using any extra space. Consider one indexing.
public class FindFirstAndLastOccurrence {
	public static void main(String[] args) {
		 int[] arr={5,3,7,8,3,6,3};
		 byte num=3;
		 findFirstAndLastOccurrence(arr, num);
	}
	
	public static void findFirstAndLastOccurrence(int[] n1,int num) {
		int num1=-1;
		int num2=-1;
		
		for(int i=0; i<n1.length; i++) {
			if(n1[i]==num) {  // 5==3 , 3==3 , 7==3,....3==3, .., 3==3
				if(num1==-1) {   // -,  -1==-1, ..... 1==-1 , 1==-1
					num1=i+1;    // -, num1=1+1=2
				}
				num2=i+1;  // num2=4+1=5 , num2=6+1=7
			}
		}
		
		if(num1==-1) {
			System.out.println("Element not founnd in the array.");
		}
		else {
			System.out.println("First occurrence of "+num+" is at index "+num1);
			System.out.println("Last occurrence of "+num+" is at index "+num2);
		}		
	}
}
/*
First occurrence of 3 is at index 2
Last occurrence of 3 is at index 7

*/