package MultiThread;

public class prioritesSet extends Thread {
	
	public void run()
	{
		
		System.out.println("Hello! its normal thread");
	}
	
	public static void main(String[] args) {
		
		prioritesSet pt = new prioritesSet();
		pt.start();
		pt.setPriority(9);
		System.out.println(pt.getPriority());
	}

}
