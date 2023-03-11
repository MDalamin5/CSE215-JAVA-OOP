package ThisObjMethod;

class A
{
	B obj;
	A(B obj)
	{
		this.obj=obj;
	}
	void display()
	{
		System.out.println(obj.data);
	}
	
}
class B
{
	int data=44;
	B()
	{
		//B objj = new B();
		//A a = new A(objj);
		A a = new A(this);
		
		a.display();
	}
}

public class ConstrCall {
	
	
	public static void main(String[] args) {
		
		B b = new B();
		
		
	}

}
