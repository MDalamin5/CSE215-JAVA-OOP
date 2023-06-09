package FinalExam;

public class localInnerClass {
	private int data = 20;
void display()
{
	class local
	{
		void msg()
		{
			System.out.println(data*3);
		}
	}
	local l = new local();
	l.msg();
}
public static void main(String[] args) {
	
	localInnerClass obj = new localInnerClass();
	obj.display();
}

}
