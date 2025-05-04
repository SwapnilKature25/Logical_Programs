package com.nit.logical.arrays;

import java.util.Scanner;

// Searching an element position from 2D array

public class TwoDimensionalDemo2 {

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
		
		System.out.println("Enter the number you want to search the position : ");
		int x =sc.nextInt();
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols;j++)
			{
				if(numbers[i][j]==x)
				{
					System.out.println(x +" found at location ("+i+","+j+")");
				}
			}
		}
	}
}

/* Enter the number of rows and columns : 
2 2
3 1 
2 4
Enter the number you want to search the position : 
3 
3 found at location (0,0)
 */
