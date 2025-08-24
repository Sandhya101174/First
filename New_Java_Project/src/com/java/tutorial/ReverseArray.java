package com.java.tutorial;

public class ReverseArray {
	public void reverse()
	{
		int temp;
		int num[]= {1,2,3,4,5};
		System.out.println(num[1]);//output 2
		
		temp=num[0];
		num[0]=num[4];
		num[4]=temp;
		
		temp=num[1];
		num[1]=num[3];
		num[3]=temp;
	
		
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
	


	}

}

