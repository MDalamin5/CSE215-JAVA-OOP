package PassingObjReference;

public class demoClass {
	int demoData;
	int demoData2;
	
	demoClass(int demoData, int demoData2)
	{
		this.demoData=demoData;
		this.demoData2=demoData2;
	}
	
	void DataChangeByObjReff(demoClass obj)
	{
		obj.demoData *= 5;
		obj.demoData2 /=2;
	}
	
	void displayData()
	{
		System.out.println("Data1: "+demoData+" Data2: "+demoData2);
	}

}
