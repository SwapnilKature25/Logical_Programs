package com.nit.logical.arrays;

import java.util.Arrays;
import java.util.Scanner;

record Student(Integer id,String name)
{
	
}

public class StudentArrayObj {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student std[];
		try
		{
			System.out.println("Enter size of student array object : ");
			int size=sc.nextInt();
			std = new Student[size];
			
			// Initializing the student array
			for(int i=0; i<size; i++)
			{
				System.out.println("Enter std id : ");
				int id= sc.nextInt();
				System.out.println("Enter std name : ");
				String name = sc.nextLine();
				sc.nextLine();
				
				std[i]=new Student(id,name);
				
			}
			System.out.println("Printing the std obj");
			System.out.println(Arrays.toString(std));
			
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Array size must be positive integer");
		}
	}

}
