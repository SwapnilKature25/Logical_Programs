package com.nit.logical.faq;

public class Array_ArmstrongNum {

	public static void main(String[] args) {
		int num=153,c=0,n=0,rem=0,d=0;
		double sum=0;
		n=num;
		d=num;
		
		if(num<0)
		{
			c=num*-1;
		}
		else if(num==0)
		{
			c=1;
		}
		
		while(n>0)
		{
			c++;
			rem=n%10;
			n/=10;
		}
		
		System.out.println("No. of digits in given no is : "+c);
		
		while(d>0)
		{
			rem=d%10;
			sum=sum+Math.pow(rem, c);
			d/=10;
		}
		
		System.out.println(sum);
		if(num==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");
		
	}

}
