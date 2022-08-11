package com.test;

public class Exp1 //implements Cloneable
{
		
	int id = 101;
	static int pin = 1919191;
	
	public void disp()
	{
		System.out.println(id+" "+Exp1.pin);
	}
	
	//factory method
	public Exp1 getObj()
	{
		
		return new Exp1();
	}
	
	public static void main(String[] args) throws Exception
	{
		
		Exp1 obj = new Exp1();
		obj.disp();
		
		Exp1 obj1 = new Exp1();
		
		Exp1 obj2 = obj1.getObj();
		
		obj2.disp();
		
		Exp1 obj3 = (Exp1) obj.clone();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
