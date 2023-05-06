package Quiz3;

import java.util.Random;
import java.util.Scanner;

public class testDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		//System.out.print("Enter the value of a & b: ");
		Random r = new Random();
		try
		{
			b=r.nextInt();
		
			c=r.nextInt();
			a=12345/(b/c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division By Zero");
			a=0;
		}
		
		System.out.println("Code is working: "+a);
	}

}
