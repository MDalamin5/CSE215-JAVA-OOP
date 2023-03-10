package ConstractorOverloading;

public class StudentMark {
	int CSE115;
	int CSE215;
	int CSE225;
	
	public StudentMark() {
		// TODO Auto-generated constructor stub
	}
	StudentMark(int CSE115, int CSE215)
	{
		this.CSE115=CSE115;
		this.CSE215=CSE215;
	}
	
	StudentMark(int CSE115, int CSE215,int CSE225)
	{
		//this.CSE115=CSE115;
		//this.CSE215=CSE215;
		this(CSE115,CSE215);
		this.CSE225=CSE225;
	}
	int addMarks()
	{
		return CSE115+CSE225+CSE215;
	}
	
	void display()
	{
		System.out.println("Marks on 3 Subject is: ");
		System.out.println("CSE215 "+CSE215+" "+CSE115+" "+" "+CSE225);
		System.out.println("Total marks is: "+addMarks());
	}

}
