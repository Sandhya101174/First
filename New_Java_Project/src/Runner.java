//import com.java.tutorial.Plumber;
import com.java.tutorial.HR1;

public class Runner {
	public static void main(String[] args) {
		//		System.out.println("Hello");
		//	Plumber p =new Plumber();
		// p.fixtap();
		HR1 vini1 = new HR1();
		vini1.isEmployeeAllow (4, null, false);
		
	boolean status=vini1.isEmployeeAllow (5, "casual", false);
		System.out.println(status);
		
	}
}
