package com.nit.logical.arrays.stream;

import java.util.stream.Stream;

public class InfiniteStreamIterateAndGenerate {

	public static void main(String[] args) {
		Stream<Integer> iterate = Stream.iterate(1, n -> n+1);
		iterate.forEach(System.out::println);
		
		
		Stream<Double> generate = Stream.generate(()-> Math.random());
		generate.forEach(System.out::println);		
	
	}

}
