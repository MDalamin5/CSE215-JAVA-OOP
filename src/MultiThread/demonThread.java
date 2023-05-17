package MultiThread;

public class demonThread extends Thread{
	
	public void run()
	{
		if(currentThread().isDaemon())
		System.out.println("I'm Demon Thread");
		else
			System.out.println("child Thewd");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello! i'm in main Method");
		demonThread dt = new demonThread();
		try
		{
			dt.setDaemon(true);
			dt.start();
		}
		catch(Exception e)
		{
			System.out.println("Haha");
		}
		
	}

}
