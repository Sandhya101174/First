package package1;
import com.java.tutorial.Methods;
public class M_calling 
{
	public static void main(String[] args) 
	{
		System.out.println("Here we are calling Methods");		
		Methods M1 = new  Methods();
		/*M1.school(10);
		M1.school(12.0,'x');
		M1.school('A', 10.0, 244);
		M1.school("sandhya");
		M1.school(20);*/
		M1.school(25);
	}
}
