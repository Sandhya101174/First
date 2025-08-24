package com.java.tutorial;

public class Plumber {
	public Plumber(int s) //parameter passing
	{
		System.out.println("Displaying Scredriver cont..."+s);
	}
	/* constructor overload
	*/
	public Plumber() 
	{
		System.out.println("Displaying Scredriver cont...");
	}
	
	
public void fixtap() {
	System.out.println("Tap is fixed.....");
}
public void fixtap(int money) {
	System.out.println("Money Taken ..." +money);//method overload
	System.out.println("charges...."+ "charge");
}

}
