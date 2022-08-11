package com.test;

class MethodChn
{
	public void method1()
	{
		System.out.println("method 1");
		
		method2();
	}
	
	public void method2()
	{
		System.out.println("method 2");
		method3();
	}
	
	public void method3()
	{
		System.out.println("method 3");
		
		methodn();
	}
	
	public void methodn()
	{
		System.out.println("method n");
	}
}

public class Exp2 {
	
	public static void main(String[] args) {
		
		MethodChn obj = new MethodChn();
		
		obj.method1();
	}
}
