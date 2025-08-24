import java.util.Scanner;
public class while_do {

     	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program for reverse number 

		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter a number ");
		int num=sc.nextInt();
		int reversed =0;
		while(num!=0)
		{
			int revnum= num % 10;
			reversed= reversed *10 +revnum;
			num=num/10;
		}
		System.out.println(reversed);
	}

}
