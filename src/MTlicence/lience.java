package MTlicence;

public class lience extends Thread{
	public void run()
	{
		try
		{
			System.out.println("Lience Start....");
			Thread.sleep(3000);
			System.out.println("Linence end,,,,,");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
