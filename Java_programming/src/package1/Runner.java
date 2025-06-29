package package1;

import com.java.tutorial.Plumber;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Plumber calling");
		Plumber Navin = new Plumber();
		Navin.fixtap();
		System.out.println("_____________________");
		Navin.fixtap(200);
		Plumber Abhishek = new Plumber();
		System.out.println("_____________________");
		Abhishek.fixtap(400);
	}

}
