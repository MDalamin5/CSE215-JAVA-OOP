package FinalExam;

public class innerClass {
	private int data =30;
	class inner
	{
		void msg()
		{
			System.out.println("Message: "+data);
		}
		class inner2
		{
			void msg2()
			{
				System.out.println("Message: "+data*2);
			}
		}
	}
	
	public static void main(String[] args) {
		innerClass obj = new innerClass();
		
		innerClass.inner in = obj.new inner();
		//inner in = new inner();
		in.msg();
		innerClass.inner.inner2 in2 = in.new inner2();
		in2.msg2();
		
		}

}
