package Basic_Program;

public class Max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=80;
		int c=60;
		if(a>b)
		{
		   if(a>c)
			{
				System.out.println("A is max");
			}
			else
			{
				System.out.println("c is max");
			}
		}

		else if(b>c)
		{
			System.out.println("b is max");		
		}
		else
		{
			System.out.println("c is max");
		}

	}

}
