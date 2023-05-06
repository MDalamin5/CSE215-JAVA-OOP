package Quiz3;

import java.io.InvalidObjectException;

public class Throws {
	static void m()
	{
		int data = 50/0;
		
	}
	static void n()
	{
		m();
	}
	static void p()
	{
		n();
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
