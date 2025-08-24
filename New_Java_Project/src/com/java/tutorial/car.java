package com.java.tutorial;

public class car {

	public void move()
	{
		System.out.println("move");
	}
	public void bike(int a, int b)
	{
		System.out.println("bike");
	}

	public void key()
	{
		System.out.println("key");
	}


	public static void main(String[] args) {
		son sb= new son();
		car c= new car();
		car b = new son();
		b.move();//child class
		c.move();//super class will call here
		sb.move();//child class will call
		b.bike(30, 10);//child class will call
		c.bike(20, 30);//  super class will call      
		sb.bike(50, 50);// child class call
	}

}
class son extends car
{
	public void move()
	{
		System.out.println("sons move");
	}
	public void bike(int a, int b)
	{  
		int c= a+b;
		System.out.println(c);
		//System.out.println("bike");
	}
}
