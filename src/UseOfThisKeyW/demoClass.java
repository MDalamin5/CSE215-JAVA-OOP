package UseOfThisKeyW;

public class demoClass {
	
	int x;
	int y;
	int z;
	
	public demoClass() {
		// TODO Auto-generated constructor stub
	}
	
     demoClass(int x,int y) {
	
    	 this.x=x;
    	 this.y=y;
	}
     demoClass(int x,int y,int z)
     {
    	 this(x,y);
    	 this.z=z;
     }

     void Hello()
     {
    	 System.out.println("Hey i'm in hello methode");
     }
     
     void intro()
     {
    	 System.out.println("how are you");
    	 this.Hello();
}
}
