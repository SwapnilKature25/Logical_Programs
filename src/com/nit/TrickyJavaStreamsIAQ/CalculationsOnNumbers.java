package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/*
7. Given a list of integers, find:
    1. The minimum number
    2. The maximum number
    3. The sum of all numbers
    4. The average of the numbers 
    5. The count of numbers
*/
public class CalculationsOnNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,3,9,1,7);
		IntSummaryStatistics summaryStatistics = numbers.stream()
			.mapToInt(n -> n)
			.summaryStatistics();
		
		System.out.println("Maximum number : "+summaryStatistics.getMax());
		System.out.println("Minimum number : "+summaryStatistics.getMin());
		System.out.println("Average of all number : "+summaryStatistics.getAverage());
		System.out.println("Sum of number : "+summaryStatistics.getSum());
		System.out.println("Count of all number : "+summaryStatistics.getCount());
	}
}
