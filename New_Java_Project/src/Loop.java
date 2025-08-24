
public class Loop
{

	public static void main(String[] args)
	{
		int row =5;

		for(int i=0;i<=row ;i++)
		{ 
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}

			System.out.println("");
		}
		for (int b= row;b>=0;b--) 
		{
			for(int c=0;c<=b;c++) 
			{
				System.out.print("*");
			}

			System.out.println("");
		}

	}
}


