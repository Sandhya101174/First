package com.java.tutorial;

public class HR1 {
	public boolean isEmployeeAllow(int workday,String dresstype,boolean ID)
	{
		if(workday==5)
		{ 
			if(ID==true)
			{
				if(dresstype=="casual"||dresstype=="formal")
				{
					System.out.println("");
					return true;
				}
				else 
				{
					return false;
				}
			}

		}
		return true;

	}
}

