package com.nit.logical.arrays;

import java.util.Arrays;

record Employee(Integer id,String name) implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee o) {
//		return this.name.compareTo(o.name);
		return this.id - o.id;
	}
	
}

public class SortUsingComparable {
	public static void main(String[] args) {
		Employee []emp = new Employee[3];
		emp[0]=new Employee(333,"Zuber");
		emp[1]=new Employee(222,"Aryan");
		emp[2]=new Employee(111,"Raj");
		
		System.out.println("Emp data before sorting : ");
		for(Employee e1 : emp)
		{
			System.out.println(e1);
		}
		
		Arrays.sort(emp);
		System.out.println("Emp data After sorting : ");
		for(Employee e1 : emp)
		{
			System.out.println(e1);
		}
			
	}
}
