package com.java.tutorial;

import java.util.Scanner;

public class Emp_with_Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ID=false;
		if(ID==true)
		{
			System.out.println("He will be allowed");
		}
		else {
			System.out.println("He wont be allowed");
		}

		Dresstype dt= new Dresstype();
		//String ans =dt.CheckDress();
		dt.CheckDress();
		//System.out.println(ans);
	}

}
class Dresstype{


	String Isallwed= "";
	void CheckDress()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your dress TYpe");
		String dress = sc.nextLine();
		if(dress.equals("formal"))
		{
			System.out.println("Allowed in Company");
		}
		else 
		{
			System.out.println("Not allowe");

		}
		//	 return Isallwed;
	}
}