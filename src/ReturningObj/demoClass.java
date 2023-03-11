package ReturningObj;

public class demoClass {
	int cse215;
	int cse225;
	
	demoClass() {
		// TODO Auto-generated constructor stub
	}
	
	demoClass(int cse215, int cse225)
	{
		this.cse215=cse215;
		this.cse225=cse225;
	}
	
	demoClass markUpdate(int data)
	{
		//case-1:
		/*
		demoClass temp = new demoClass(cse215,cse225);
		temp.cse215 +=data;
		return temp;
		*/
		
		///*
		//case-2
		demoClass temp2 = new demoClass();
		temp2.cse215 += data;
		return temp2;
		//*/
	}
	
	//passing object and return object
	demoClass markUpdatee(demoClass obj)
	{
		obj.cse215 +=10;
		obj.cse225 -=3;
		return obj;
	}

	@Override
	public String toString() {
		return "demoClass [cse215=" + cse215 + ", cse225=" + cse225 + "]";
	}
	
	

}
