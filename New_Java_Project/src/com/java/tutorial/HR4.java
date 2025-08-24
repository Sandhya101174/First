package com.java.tutorial;

  protected class HR4 
{
	public HR4(int count_of_Hr) {
		System.out.println("Total_HR="+count_of_Hr);
	}

	public static void main(String []args)
	{
		String name="sandhya";
		name="yadnesh";
		System.out.println(name.charAt(1));
		String name1 =new String("yadnesh");
		System.out.println(name1.hashCode());
		String name2 =new String("sandhya");
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());//it
		HR4 company = new HR4(10);
		String a1=new String("company"+company);
		System.out.println(a1.hashCode());
		String num =new String("Rahul");
        num=new String("varun");
		System.out.println(num);

	}
}
