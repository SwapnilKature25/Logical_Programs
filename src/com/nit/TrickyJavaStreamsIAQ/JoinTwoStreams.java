package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//How to join two streams?
public class JoinTwoStreams {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,12,21);
		List<Integer> list2 = Arrays.asList(31,42,51);

//		1st 
		Stream<Integer> combinedStreams = Stream.concat(list1.stream(), list2.stream());
		combinedStreams.forEach( (stream)-> System.out.print(stream+" "));  // 10 12 21 31 42 51 
		System.out.println(combinedStreams);
		System.out.println("\n+++++++++++++++++++");
		
//		2nd
		List<List<Integer>> lists = Arrays.asList(list1,list2);
		List<Integer> combined = lists.stream().flatMap(lst -> lst.stream()).toList();
		System.out.println(combined);  // [10, 12, 21, 31, 42, 51]

	}
}
