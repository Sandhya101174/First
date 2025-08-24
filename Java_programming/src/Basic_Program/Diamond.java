package Basic_Program;

public class Diamond {
	public void dia()
	{
		int n=5;
		for(int i =1;i<=n;i++)
		{

			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			} 

			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	}
	public static void main(String [] args)
	{
		Diamond d = new Diamond();
		d.dia();
	}
}
