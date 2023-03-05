package Class_Object;
class A{
	int age;
	String name;
	
	void display()
	{
		System.out.println("Name: "+name+"\nAge: "+age);
	}
}
class box{
	int h;
	int d;
	int w;
	box(int h,int d,int w)
	{
		this.h=h;
		this.d=d;
		this.w=w;
	}
	int getVolume(box x)
	{
		return x.h*x.d*x.w;
	}
	int getVoluem(int x,int y,int z)
	{
		return x*y*z;
	}
}
public class multiclass {

	public static void main(String[] args) {
		A ob = new A();
		ob.name="Al Amin";
		ob.age=24;
		ob.display();
		
		box mybox = new box(1,3,4);
		
		System.out.println(mybox.getVolume(mybox));
		box ob3=mybox;
		System.out.println(ob3.d);
		mybox.d=44;
		System.out.println(mybox.d);
		box mybox1 = new box(1,4,4);
		System.out.println(mybox1.getVoluem(1, 4, 4));
		System.out.println(mybox1.getVolume(mybox1));
		

	}

}
