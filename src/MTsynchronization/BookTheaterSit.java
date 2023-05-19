package MTsynchronization;

public class BookTheaterSit {
	int total_sits=10;
	
   synchronized void sitBook(int sit)
	{
		if(total_sits>=sit)
		{
			System.out.println("Sit Booked Successfully");
			total_sits=total_sits-sit;
			System.out.println("Sit left: "+total_sits);
		}
		else
		{
			System.out.println("Sit is not Booked");
			System.out.println("Sit left : "+total_sits);
		}
	}

}
