package ThisObjMethod;

public class DemoObj {
	
	//DemoObj ob1 = new DemoObj();
	
	void display()
	{
		System.out.println("Its Display Method");
		//this.test(ob1);
		this.test(this);
	}
	
	
	
	void test(DemoObj ob)
	{
		System.out.println("Hello! i'm taking only object");
	}

}
