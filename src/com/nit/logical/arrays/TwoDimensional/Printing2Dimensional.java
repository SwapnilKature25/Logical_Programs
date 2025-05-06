package com.nit.logical.arrays.TwoDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Printing2Dimensional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns : ");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int[][] numbers = new int[rows][cols];
		
		System.out.println("Enter elements : "+(rows*cols));
		// inserting the elements into 2D array
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				numbers[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Printing the data in 1st way : ");
		System.out.println(Arrays.deepToString(numbers));
		
		System.out.println("Printing the data in 2nd way : ");
		for(int x[] : numbers)
		{
			System.out.println(Arrays.toString(x));
		}
		
		
		System.out.println("Printing the data in 3rd way : ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Printing the data in 4th way : ");
		for(int []y: numbers)
		{
			for(int k : y)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	
	
	}

}
