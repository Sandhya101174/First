package com.java.tutorial;

public class HR2 
{
	//	public HR2(int count_of_Hr) {
	//		System.out.println("Total_HR="+count_of_Hr);
	//	}

	public void move()
	{
		System.out.println("This is new function");
	}
}

//SUbclass or Child class
class AA extends HR2
{
	//		 public AA(int count_of_H) {
	//				super(count_of_H);
	//			}

	public void move() 
	{
		System.out.println("ABC"); 
	}

}


class stu
{
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
		HR2 company = new HR2();
		String a1=new String("company"+company);
		System.out.println(a1.hashCode());
		String num =new String("Rahul");
		num=new String("varun");
		System.out.println(num);
		System.out.println("-----------------------------------------------");
		HR2 abc=new HR2();
		abc.move();
		AA a = new AA();
		a.move();
		HR2 b = new AA();
		b.move();
//		AA c = new HR2();
//		c.move();
		
		

	}
	
	//Animal - Superclass, Tiger - Childclass
	//Tiger is a Tiger -----Tiger t = new Tiger();
	//Tiger is an animal----Animal r = new Tiger();
	//Animal is a Tiger --- Tiger a= new Animal();
	
	
}


