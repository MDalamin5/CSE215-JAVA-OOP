package Quiz3;

public class testDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=32/2;
			int arr[] = {1,3,4,5};
			arr[2]=4*3;
			int a = args.length;
			System.out.println("a = "+a);
			int b = 42/a;
			int c[]= {1};
			c[42]=99;
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by zero...."+e);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("arrindex out bound...."+e);
		}
		
		
		catch(Exception e)
		{
			System.out.println("boss");
		}
		
		System.err.println("After catch block");

	}

}
