package com.java.tutorial;

public class Simple {
	public Simple(	)
	{
	    System.out.println("This is constractor");	
	}
	public Simple(int a, int b)
	{System.out.println("This is two parameter");
	
	}
	 static int  addition  (int a,int b) 
	{
		return a+b;
		
	}
public static void main(String[] args) {
	
	
	int result= Simple.addition(30, 10);
	System.out.println(result);
	
}
}
