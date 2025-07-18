package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeSortedLists {
//	Merge two sorted lists into a single sorted list using java streams?
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,12,21);
		List<Integer> list2 = Arrays.asList(31,42,51);

		List<Integer> mergeSortedList = Stream.concat(list1.stream(), list2.stream())
								.sorted()
								.toList();
		mergeSortedList.forEach(System.out::println);  // always prints on new line
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println(mergeSortedList);  // [10, 12, 21, 31, 42, 51]
	}

}
