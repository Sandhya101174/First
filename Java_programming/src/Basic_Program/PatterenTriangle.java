package Basic_Program;

public class PatterenTriangle 
{
public void six()
{
for(int i =1;i<=6;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println(" ");
	
}
}	
public static void main(String [] args)
{
	PatterenTriangle a =new PatterenTriangle();
	a.six();
}
}
