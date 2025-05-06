package com.nit.logical.arrays.TwoDimensional;

public class AddUsingMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,3,5},{2,4,6}};  // 2 rows 3 cols
		int b[][]= {{5,7,9},{1,1,1}};
		
		// matrix to perform addition
		int sum[][]=new int[2][3];
		
		// adding and printing addition of 2 matrices
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
