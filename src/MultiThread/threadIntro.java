package MultiThread;

public class threadIntro extends Thread {
	
 public void run()
 {
	 for(int i=0;i<=3;i++)
	 {
		 System.out.println(i);
		 
	 }
 }
 
 public static void main(String[] args) {
	
	 threadIntro ob = new threadIntro();
	 threadIntro ob2 = new threadIntro();
	 ob.start();
	 try
	 {
		 ob.join();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Haha");
	 }
	 ob2.start();
	 //System.out.println("Hello");
	 currentThread().setName("Al Amin");
	 //System.out.println(10/0);
	 System.out.println(currentThread().getName());
}
}
