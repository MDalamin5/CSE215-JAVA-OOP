package MTlicence;

public class medical extends Thread{
	public void run()
	{
		try
		{
			System.out.println("Medical Start....");
			Thread.sleep(3000);
			System.out.println("Medical end,,,,,");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
