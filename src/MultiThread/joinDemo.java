package MultiThread;


public class joinDemo extends Thread{
	
	public void run()
	{
		try
		{
			for(int i=0;i<6;i++)
			{
				System.out.println(Thread.currentThread().getName()+ " "+ i);
				Thread.sleep(500);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws Exception {
		
		joinDemo jd = new joinDemo();
		jd.start();
		jd.join();
		
		try
		{
			for(int i=0;i<6;i++)
			{
				System.out.println(Thread.currentThread().getName()+ " "+ i);
				Thread.sleep(500);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
