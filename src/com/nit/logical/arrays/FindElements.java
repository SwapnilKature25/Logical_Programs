package com.nit.logical.arrays;
//Given an integer array length 2,return true if it contains a number 2 or 3.
public class FindElements {

	public static void main(String[] args) {
		int arr[]= {3,5,2,5};
		boolean findElements = findElements(arr);
        System.out.println("Array contains 2 or 3 :"+findElements);
	}
	
	public static boolean findElements(int arr[])
	{
		int flag=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==2 || arr[i]==3)
				flag++;
		}
		if(flag>=1)
			return true;
		else 
			return false;
	}

}
