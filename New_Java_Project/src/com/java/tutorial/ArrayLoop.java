package com.java.tutorial;

public class ArrayLoop {
	public void ForLoop()
	{

		int num[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		//int n=num.length;
		for(int i=0;i<num.length/2;i++)//length will be cal and
		{
			int temp= num[i];
			num[i]=num[num.length-i-1];
			num[num.length-i-1]=temp;

		}
		for(int a:num)//every ret index value save in a variable
		{
			System.out.println(a);
		}

	}

}
