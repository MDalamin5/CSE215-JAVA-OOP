package MultiThread;

public class yeldDemo extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		
		yeldDemo yd = new yeldDemo();
		yd.currentThread().setName("Child thead");
		yd.start();
		
		Thread.yield();
		for(int i=0;i<=5;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
