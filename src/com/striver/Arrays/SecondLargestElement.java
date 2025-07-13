package com.striver.Arrays;

import java.util.Arrays;
// Second largest element in an array without sorting
public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[]= {1,2,4,7,7,7,5};
		
//		1st way i.e Brute
		int n=arr.length;
		Arrays.sort(arr);
		int largest = arr[n-1];
		int sLargest=0;
		for(int i=n-1; i>=0; i--) {
			if(arr[i]!=largest) {
				sLargest=arr[i];
				break;
			}
		}		
		System.out.println("Second largest element is : "+sLargest);
		System.out.println("+==================================================+");
		
		
//		Better way 
		int arr2[]= {1,2,4,7,7,7,5};
		int l=arr2[0];
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]>l) {
				l=arr2[i];
			}
		}
		System.out.println(l);
		
		int slarge=-1;
		for(int i=0; i<arr2.length; i++) {
			if(arr[i]>slarge && arr[i]!=largest) {
				slarge=arr[i];
			}
		}
		System.out.println("Second largest element is : "+slarge);
		System.out.println("+==================================================+");
		
//		Optimal way
		int a[]= {1,2,4,7,7,5};
		int large=a[0];
		int slargest=-1;
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>large) {  //2>1  4>2 7>4 7>7 5>7
				slargest=large;  // =1 =2  =4
				large=a[i];   // 2  4  7
			}
			else if(a[i] < large && a[i] > slargest) {  //  5<7 && 5>4
				slargest=a[i];  // slarge = 5
			}
		}		
		System.out.println("The second largest element : "+slarge+" and largest : "+large);
		
	}
}
