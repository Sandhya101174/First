package package1;



public class Simple {
	public Simple(	)
	{
		System.out.println("This is constractor");	
	}
	public Simple(int a, int b)
	{
		System.out.println("This is two parameter");
	}

	static float Add()
	{
		float x=(float)2.0;
		float y=(float)5.0;
		return x+y;
	}
	static int  addition () 
	{
		int a=0;
		int b=5;
		return a+b;
	}
	
	public static void main(String[] args) {

		//Simple obj1 = new Simple();
		//Simple obj2 = new Simple(20,30);
		//System.out.println(obj1.a);
        float f_result=Simple.Add();
        System.out.println("decimal of two numbers.."+f_result);
		int result= Simple.addition();
		System.out.println("Addition of two number.."+result);

	}
}
