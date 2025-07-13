package TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Check if a list of integers contains a prime number using Java streams?
// ex : Prime no. Ex : 2,3,5,7,11,13,17,...
public class PrimeCheck {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,4,6,8,9,11,15,16);
		
//		anymatch() will check any one of the condition matches
//		boolean containPrime = numbers.stream()
////					.anyMatch(ele -> isPrime(ele));  // 1 way
//					.anyMatch(PrimeCheck::isPrime);      // 2 way
//		System.out.println("Is ArrayList contains prime number : "+ containPrime);  // true
//		
		
//		if we want to print those prime numbers then , here it is
		List<Integer> primeNumbers = numbers.stream()
				.filter(PrimeCheck::isPrime)
				.toList();		
		System.out.println(primeNumbers);  // [3, 11]

		
		
	}
	
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		
//		for(int i=2; i<Math.sqrt(num); i++) {
//			if(num%i==0) return false;
//		}
//		return true;
		
//		using java 8 features    
//		if none of matches with the condition num%i==0 then it will return true otherwise false
		return IntStream.rangeClosed(2, (int) Math.sqrt(num))    // working as for loop
				.noneMatch(i -> num%i==0);    // [3, 11]
		
	}
	
}
