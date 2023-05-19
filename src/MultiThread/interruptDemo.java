package MultiThread;

public class interruptDemo extends Thread{
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		interruptDemo ob = new interruptDemo();
		ob.start();
		ob.interrupt();
	}

}
