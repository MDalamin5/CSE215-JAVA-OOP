package MultiThread;

public class sleepDemo extends Thread {
	
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println(i+ " "+Thread.currentThread().getName());
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e.fillInStackTrace());
			}
		}
	}
	public static void main(String[] args) {
		
		sleepDemo sd = new sleepDemo();
		sleepDemo sd1 = new sleepDemo();
		sd.start();
		sd1.start();
		//sd.run();
	}
}
