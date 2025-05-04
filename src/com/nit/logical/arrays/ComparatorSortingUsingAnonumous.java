package com.nit.logical.arrays;

import java.util.Arrays;
import java.util.Comparator;

record Product(Integer id,String name)
{
	
}

public class ComparatorSortingUsingAnonumous {

	public static void main(String[] args) {
		
		// Anonymous inner class
		Product products[]=new Product[3];
		products[0]=new Product(121,"sw");
		products[1]=new Product(222,"pw");
		products[2]=new Product(111,"lw");
		
		Comparator<Product> comp=new Comparator<Product>()
		{
			@Override
			public int compare(Product p1,Product p2)
			{
				return p1.id().compareTo(p2.id());
			}
		};
		
		Arrays.sort(products,comp);
		System.out.println("Product obj after sorting by using id : ");
		
		for (Product product : products) {
			System.out.println(product);
		}
		
	}

}
