package com.nit.logical.arrays.TwoDimensional;

import java.util.Scanner;

public class SerachingElementLocation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns : ");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int[][] num=new int[rows][cols];
		
		System.out.println("Enter elements : "+(rows*cols));
		// inserting the elements into 2D array
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the element you want to search position of : ");
		int n=sc.nextInt();
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(num[i][j]==n)
				{
					System.out.println(n+" found at location ("+i+","+j+")");
				}
			}
		}
	}

}
