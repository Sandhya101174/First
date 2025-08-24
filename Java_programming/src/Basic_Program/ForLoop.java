package Basic_Program;

public class ForLoop {
	public static void abc()
	{
		int N=50;

		if (N <= 0) {

		
		System.out.println("Enter a value greater than 0.");
		} else {
			int sum = 0;
			for (int i = 1; i <= N; i++) {
				sum += i;  // Adds each number to the sum
			}
			System.out.println("Sum of first " + N + " natural numbers is: " + sum);
		}
	}
	public static void main(String[] args)
	{
		ForLoop a= new ForLoop();
		ForLoop.abc();
	}
}
