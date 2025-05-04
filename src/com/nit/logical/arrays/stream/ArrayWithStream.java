package com.nit.logical.arrays.stream;

import java.util.stream.Stream;
record Productss(Integer id,String name)
{
	
}


public class ArrayWithStream {

	public static void main(String[] args) {
		Stream<Integer> stream1=Stream.of(1,2,3,4,5,6);
		stream1.forEach(num -> System.out.print(num+" "));
		
		Stream<String> stream2 = Stream.of("Scott","Smith","Raj","Alen");
		stream2.forEach(str -> System.out.println(str+" "));
		
		Productss p1=new Productss(222,"Mobile");
		Productss p2=new Productss(111,"Laptop");
		Productss p3=new Productss(444,"Camera");
		Productss p4=new Productss(333,"Mobile");
		
		Stream<Productss> stream3 = Stream.of(p1,p2,p3,p4);
		stream3.forEach(prod -> System.out.println(prod));
	
	}

}
