package InterThreadComm;
import java.util.Scanner;
public class T2 implements Runnable{
	Chat m;
	String msg;
	public T2(Chat m1)
	{
		this.m=m1;
		new Thread (this, "Kaysar: ").start();
	}
	Scanner scan = new Scanner(System.in);
	public void run()
	{
		for(int i=10;i!=3;i++)
		{
			
			msg=scan.nextLine();
			String stop="Bye";
			if(msg.equals(stop))
			{
				i=3;
				break;
			}
			
			m.Answer(msg);
		}
	}

}
