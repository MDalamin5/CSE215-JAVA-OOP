package PassingValue;

public class Operation {
	int data=50;
	String name="HElo";
	
	void change(Operation a)
	{
		a.data=a.data+3;
		a.name="Alamin";
	}

}
