package InterThreadComm;

import java.util.Scanner;

public class T3 implements Runnable{
	Chat m;
	String msg;
	public T3(Chat m1)
	{
		this.m=m1;
		new Thread (this, "Shahin: ").start();
	}
	Scanner scan = new Scanner(System.in);
	public void run()
	{
		for(int i=10;i!=3;i++)
		{
			
			msg=scan.nextLine();
			String stop="Bye";
			int count=0;
			for(int j=0;j<stop.length();j++)
			{
				
				if(stop.charAt(j)==msg.charAt(j))
				{
					count++;
				}
				
			}
			if(count==3)
			{
				i=3;
				break;
			}
			m.Answer(msg);
		}
	}

}
