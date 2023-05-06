package Quiz3;

public class Throw {
	static void validata(int age)
	{
		if(age<18)
			throw new ArithmeticException("Age less than 18");
		else
			System.out.println("Oke good to go");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validata(6);

	}

}
