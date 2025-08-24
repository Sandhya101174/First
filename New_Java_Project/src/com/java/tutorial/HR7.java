package com.java.tutorial;

  class HR7 //package private/default
{
	public HR7(int count_of_Hr) 
	{
		System.out.println("Total_HR="+count_of_Hr);
		}

	public static void main(String []args)
	{
		String name="sandhya";
		name="yadnesh";
		System.out.println(name.charAt(1));//it is use for 
		String name1 =new String("yadnesh");
		System.out.println(name1.hashCode());//it show the address of name1
		String name2 =new String("sandhya");
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());//it
		HR7 company = new HR7(19);
		String a1=new String("company"+company);
		System.out.println(a1.hashCode());
		String num =new String("Rahul");
        num=new String("varun");
		System.out.println(num);
        HR1 xy =new HR1();
		
	}
}
