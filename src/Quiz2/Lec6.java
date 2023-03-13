package Quiz2;

public class Lec6 {
	int data;
	String st;

	Lec6(int data, String st)
	{
		this.data=data;
		this.st=st;
	}
	
	void display()
	{
		System.out.println("data: "+data+" st: "+st);
	}
	
	public static void main(String[] args) {
		
		Lec6 ob= new Lec6(33, "Al Amin");
		ob.display();

	}

}
