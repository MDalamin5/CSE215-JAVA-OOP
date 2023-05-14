package MultiThread;

public class threadNaming extends Thread {
	
	public void run()
	{
		//Thread.currentThread().setName(" ");
		System.out.println("Thread Task: "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		threadNaming ob = new threadNaming();
		
		ob.setName("haha");
		ob.start();
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(ob.isAlive());
		
	}

}
