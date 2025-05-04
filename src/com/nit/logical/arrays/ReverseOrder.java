package com.nit.logical.arrays;

import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		System.out.println("enter element : ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
}
