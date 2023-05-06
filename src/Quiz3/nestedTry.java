package Quiz3;

public class nestedTry {

	public static void main(String[] args) {
		
		try
		{
			//int m=10/0;
			System.out.println("Haha ");
			
			try
			{
				System.out.println("Going to divide");
				int b= 32/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e+"1");
			}
			
			try
			{
				int a[]=new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e+"  two");
			}
			
			System.out.println("Other statement");
		}
		catch(Exception e)
		{
			System.out.println("handeled");
		}
		System.out.println("Normal Flow");

	}

}
