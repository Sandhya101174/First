package com.java.tutorial;

public class RLoops {
public void Rever()
{
	int a[]= new int [80];
     int n=80;
	for(int i=0;i<n-1;i++)
	{
		a[i]=i+1;
	}
	for(int i=0;i<=n-1;i++)
	{
		System.out.println(a[i]);
	}
	
}
public static void main(String [] args)
{
RLoops d =new RLoops();
d.Rever();


}
}
