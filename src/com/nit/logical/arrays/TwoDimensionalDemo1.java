package com.nit.logical.arrays;

import java.util.Scanner;

public class TwoDimensionalDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns : ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int [][]numbers= new int[rows][cols];
		
		// Inserting the elements into 2D array
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols;j++)
			{
				numbers[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Printing the data...");
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.println(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		// 4 3
		// 1 3
		
	}

}
