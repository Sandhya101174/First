
package com.java.tutorial;

public class NestedArrrayFor {
	public void Loop()
	{
		int num[]= {42,66,12,5,9};
		int smallest=num[0];
		
			for(int i=1;i<num.length;i++)
			{
				if(num[i]<smallest)
				{
					smallest=num[i];
				}
				
			}
			System.out.println("Smallest number is :"+smallest);
	}
}

