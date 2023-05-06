package CustomException;

public class test {
	public static void main(String[] args)
	{
		try
		{
			throw new MyException("Hello ");
		}
		catch(MyException ex)
		{
			System.out.println("Cought");
			System.out.println(ex.getMessage());
		}
	}

}
