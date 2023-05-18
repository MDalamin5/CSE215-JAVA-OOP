package MTlicence;


public class driver {

	public static void main(String[] args) throws InterruptedException {
		medical ob1 = new medical();
		ob1.start();
		ob1.join();
		
		lience ob2 = new lience();
		ob2.start();
		ob2.join();
		finalTest ob3 = new finalTest();
		ob3.start();

	}

}
