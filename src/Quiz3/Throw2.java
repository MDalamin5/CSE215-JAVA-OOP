package Quiz3;

public class Throw2 {
	static void demoproc()
	{
		try
		{
			throw new NullPointerException("Demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Cought inside demoproc. ");
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			demoproc();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Recauht : "+e);
		}

	}

}
