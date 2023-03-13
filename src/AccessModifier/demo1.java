package AccessModifier;

class A
{
	//private int a;
	A meth()
	{
		return this;
	}
	void dis()
	{
		System.out.println("Hello display");
	}
}

public class demo1 {

	public static void main(String[] args) {
		new A().meth().dis();
		

	}

}
