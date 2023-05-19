package MultiThread;

public class indereptedDemo extends Thread {
	public void run()
	{
		//System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().interrupted());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(500);
				//System.out.println(Thread.interrupted());
				//Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		indereptedDemo ob = new indereptedDemo();
		ob.start();
		ob.interrupt();
	}

}
