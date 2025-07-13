package TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// How do you sort the given list of decimals in reverse order?

public class SortDecimalsInReverse {

	public static void main(String[] args) {
		List<Double> decimals = Arrays.asList(3.23, 1.43, 1.1, 2.13, 2.5, 3.2);
		
		 List<Double> ascendingDecimals = decimals.stream().sorted().toList();
		 System.out.println(ascendingDecimals);   // [1.1, 1.43, 2.13, 2.5, 3.2, 3.23]

		 
		 List<Double> descendingDecimals = decimals.stream().sorted(Comparator.reverseOrder()).toList();
		 System.out.println(descendingDecimals);   // [3.23, 3.2, 2.5, 2.13, 1.43, 1.1]	 
	}
}
