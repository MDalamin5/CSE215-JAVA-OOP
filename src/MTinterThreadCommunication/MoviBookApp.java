package MTinterThreadCommunication;

public class MoviBookApp {
	public static void main(String[] args) {
		
		totalEarning ob = new totalEarning();
		ob.start();
		
		synchronized (ob) {
			try
			{
				ob.wait();
				System.out.println("Total Earnig: "+ ob.total+" Taka");

			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
