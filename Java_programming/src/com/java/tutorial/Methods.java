package com.java.tutorial;

import java.util.Scanner;

public class Methods {
	Scanner sc = new Scanner(System.in);

	public void school(double b) 
	{
		System.out.println("This is static method..");
	}
	public void school(double a,char b)
	{
		System.out.println("This is static method with two Arrgument");
	}
	public void school(char a,double b, int c)
	{
		System.out.println("Non-Static with three parameters");
	}
	static void school() 
	{

		System.out.println("THIS IS WITJOUT PASSING PrMETER");
	}
	public void school(String fname) {
		System.out.println("This is string we have used i string value..."+fname);
	}
	public  void school(int age ) {
		System.out.println("Enter your age ");
		int yearage= sc.nextInt();
		if( yearage>18) {
			System.out.println("Applicable for this"); 
		}
		else {
			System.out.println("Not a applicable for this");
		}
	}
}


