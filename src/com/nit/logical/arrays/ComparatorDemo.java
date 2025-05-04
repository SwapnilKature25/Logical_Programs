package com.nit.logical.arrays;

import java.util.Arrays;

record Prod(Integer id,String name)
{
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		Prod []pr=new Prod[4];
		pr[0]=new Prod(222,"Mobile");
		pr[1]=new Prod(111,"Laptop");
		pr[2]=new Prod(666,"Camera");
		pr[3]=new Prod(444,"Headphone");
		
		System.out.println("Original Product objects :");
		
		for(Prod p : pr)
		{
			System.out.println(p);
		}
		
		System.out.println("===============================");
		
		System.out.println("Product objects sorting by using id :");
		Arrays.sort(pr, (i1,i2)->i1.id().compareTo(i2.id()));
		for(Prod p : pr)
		{
			System.out.println(p);
		}
		
		System.out.println("===============================");
		
		System.out.println("Product objects sorting by using name :");
		Arrays.sort(pr, (i1,i2)->i1.name().compareTo(i2.name()));
		for(Prod p : pr)
		{
			System.out.println(p);
		}
		
	}

}
