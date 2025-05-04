package com.nit.logical.arrays;

import java.util.Scanner;

public class SumOfAll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size=sc.nextInt();
		int sum=0;
		int []arr=new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		
		System.out.println("Sum of All elements : "+sum);
	
			
	}

}
