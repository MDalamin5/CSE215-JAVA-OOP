package Quiz3;

import java.io.IOException;

public class ExceptionPropagation {

	static void m() throws IOException
	{
		int data = 50/0;
		
	}
	static void n() throws IOException
	{
		m();
	}
	static void p() throws Exception
	{
		try
		{
			n();
		}
		catch (Exception e) {
			System.out.println("Exception handling");
			// TODO: handle exception
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throws ob = new Throws();
		try
		{
			ob.p();
		}
		catch (Exception e) {
			System.out.println("Exception handling");
			// TODO: handle exception
		}
		
		System.out.println("Normal Flows");

	}

}
