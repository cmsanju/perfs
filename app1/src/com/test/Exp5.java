package com.test;

class Book
{
	//Book obj = new Book();
	
	public Book()
	{
		this("java");
		//Book obj = new Book("java");
		System.out.println("default");
	}
	
	public Book(String str)
	{
		this(22);
		System.out.println("single arg");
	}
	
	public Book(int x)
	{
		System.out.println("int args");
	}
}

public class Exp5 {
	
	public static void main(String[] args) {
		
		Book obj = new Book();
		
	}

}
