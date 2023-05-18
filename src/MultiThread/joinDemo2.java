package MultiThread;

public class joinDemo2 extends Thread {
	
	static Thread mythread; 
	public void run()
	{
		
		
		try
		{
			mythread.join();
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
		
		 mythread = Thread.currentThread();
		
		joinDemo2 jd = new joinDemo2();
		jd.start();
		//jd.join();
		
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
