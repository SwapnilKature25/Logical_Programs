package com.nit.logical.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingTwoDimensional {

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
		
		System.out.println("Printing the data with 1st way : ");
		System.out.println(Arrays.deepToString(numbers));
		
		System.out.println("Printing the data with 2nd way : ");
		for(int x[] : numbers)
		{
			System.out.println(Arrays.toString(x));
		}
	
		System.out.println("Printing the data with 3rd way : ");
		for(int []y : numbers)
		{
			for(int k : y)
			{
				System.out.println(k);
			}
		}
	
	}

}

/* Enter the number of rows and columns : 
2 2
1 3 
5 3
Printing the data with 1st way : 
[[1, 3], [5, 3]]
Printing the data with 2nd way : 
[1, 3]
[5, 3]
Printing the data with 3rd way : 
1
3
5
3
 */
