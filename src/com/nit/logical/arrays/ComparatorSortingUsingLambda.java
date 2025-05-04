package com.nit.logical.arrays;

import java.util.Arrays;
import java.util.Comparator;

record Products(Integer id,String name)
{
	
}

public class ComparatorSortingUsingLambda {

	public static void main(String[] args) {
		Products products[]=new Products[3];
		products[0]=new Products(121,"sw");
		products[1]=new Products(222,"pw");
		products[2]=new Products(111,"lw");
		
		// using lambda  1st Approach
//		Comparator<Products> comp= (i1,i2)-> i1.id().compareTo(i2.id()) ;
//		Arrays.sort(products,comp);
		
		// using lambda  2nd Approach
		Arrays.sort(products, (p1,p2)->p1.id().compareTo(p2.id()));

		
		System.out.println("Product obj after sorting by using id : ");
		
		for (Products product : products) {
			System.out.println(product);
		}
		
		
		
	}

}
