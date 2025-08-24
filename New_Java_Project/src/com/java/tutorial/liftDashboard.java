package com.java.tutorial;
import Java_Inter.Lift;
public class liftDashboard implements Lift
{
	public void selectflooer()
	{
		System.out.println("Lift should go on selected fooler");
	}

	public static void main(String []args)
	{
		liftDashboard light=new  liftDashboard();
		light.selectflooer();
	}
}