package MTlicence;

public class finalTest extends Thread{
	public void run()
	{
		try
		{
			System.out.println("sign Start....");
			Thread.sleep(3000);
			System.out.println("signe  end,,,,,");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
