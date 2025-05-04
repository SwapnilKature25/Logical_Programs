package com.nit.logical.arrays.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamWithOf {
	public static void main(String[] args) {
		IntStream intStream = IntStream.of(1,2,3,4,5);
		intStream.forEach(System.out::println);
		System.out.println("");
		
		LongStream longStream = LongStream.of(10,20,30,40);
		longStream.forEach(System.out::println);
		System.out.println("");

		DoubleStream doubleStream = DoubleStream.of(1.0,2.0,3.0,4.0);
		doubleStream.forEach(System.out::println);
		System.out.println("");
		
		
		
		
	}
}
