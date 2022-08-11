package com.test;

class Student
{
	public Student()
	{
		this(20);
		System.out.println("constructor");//5
	}
	
	public Student(int x)
	{
		System.out.println("single args");
	}
	
	static
	{
		System.out.println("static block");//3
	}
	
	{
		System.out.println("instance block");//4
	}
	
	public Student getObj()
	{
		return new Student();
	}
}

public class Exp4 {
	
	static
	{
		System.out.println("static block");//1
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");//2
		
		Student obj = new Student();
		Student obj1 = new Student();
		
		obj1.getObj();
	}

}
