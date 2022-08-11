package com.test;

class Employee
{
	//default constructor
	public Employee()
	{
		System.out.println("default");
	}
	
	//parameterised constructor
	public Employee(int x, String y)
	{
		System.out.println("parameterised");
	}
	
	//overloaded constructor
	public Employee(double x, char y)
	{
		System.out.println("overloaded");
	}
	
	//object parameterised constructor
	public Employee(Employee obj)
	{
		System.out.println("object parameterised");
	}
}

public class Exp3 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(20, "java");
		Employee e3 = new Employee(45.54, 'A');
		Employee e4 = new Employee(e1);
	}

}
