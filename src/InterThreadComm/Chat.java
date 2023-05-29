package InterThreadComm;

public class Chat {
	boolean flag = false;
	
	public synchronized void Question(String msg)
	{
		if(flag)
		{
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+msg);
		flag=true;
		notify();
	}
	
	public synchronized void Answer(String msg)
	{
		if(!flag)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println( Thread.currentThread().getName()+" "+msg);
		flag=false;
		notifyAll();
	}

}
