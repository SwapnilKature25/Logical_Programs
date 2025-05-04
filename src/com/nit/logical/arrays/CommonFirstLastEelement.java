package com.nit.logical.arrays;

public class CommonFirstLastEelement {

	public static void main(String[] args) {
		int arr1[]= {21,23,24,21};
		int arr2[]= {23,23,24,21};
		boolean b=commonStartEnd(arr1, arr2);
		System.out.println("Does both arrays first or last element is same "+b);
		
	}
	
	public  static boolean commonStartEnd(int arr1[],int arr2[]) {
		if(arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1])
			return true;
		
		return false;
	}

}
