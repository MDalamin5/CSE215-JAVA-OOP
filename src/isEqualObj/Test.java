package isEqualObj;

public class Test {
	int a;
	int b;
	Test()
	{
		
	}
	
	Test(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	Test(Test o)
	{
		this.a=o.a;
		this.b= o.b;
	}
	
	boolean isEqual(Test ob)
	{
		if(this.a==ob.a && this.b==ob.b)
			return true;
		    return false;
	}
	
	void valueUpdate(Test o)
	{
		o.a= 2+o.a;
		o.b = 2*o.b;
	}
	
	Test updateValue(Test ob)
	{
		Test ob2 = new Test(ob);
		ob2.a *= 2;
		ob2.b /= 3;
		
		return ob2;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	

}
