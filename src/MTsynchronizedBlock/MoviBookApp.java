package MTsynchronizedBlock;



public class MoviBookApp extends Thread{
    
	 static	BookTheaterSit b;
		int sits;
		 
		public void run()
		{
			b.sitBook(sits);
		}
		
		public static void main(String[] args) {
			
			b= new BookTheaterSit();
			
			MoviBookApp alamin = new MoviBookApp();
			alamin.sits=7;
			alamin.start();
			
			MoviBookApp shahin = new MoviBookApp();
			shahin.sits=6;
			shahin.start();
		}
	}

