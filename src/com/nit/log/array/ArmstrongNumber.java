package com.nit.log.array;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153, sum=0,rev=0, temp=num;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			sum=(int) (sum+Math.pow(rem, 3));
			num/=10;
		}
		System.out.println(temp==sum ? "Armstrong" : "not an Armstrong");
	}

}
