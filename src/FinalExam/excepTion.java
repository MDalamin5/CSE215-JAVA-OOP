package FinalExam;

public class excepTion {
	public static void main(String[] args) {
		
		try
		{
			
			System.out.println("Hello");
			try
			{
				int data = 50/0;
				System.out.println("Its oka ");
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Its oka ");
			}
			try
			{
				int data = 50/0;
				System.out.println("Its oka ");
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Its ssssssssoka ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Its okaddddddd ");
			
		}
		System.out.println("Normal Floww");
	}

}
