package com.nit.logical.arrays;

class FindMin
{
	public static void getMinimumValue(int []arr)
	{
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(min > arr[i])  min=arr[i];
		}
		System.out.println("Minimum value "+min);
	}
}

public class MinimumElement {

	public static void main(String[] args) {
		int arr[]= {4,3,2,5,6};
		FindMin.getMinimumValue(arr);
	}

}
