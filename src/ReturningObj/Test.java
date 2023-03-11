package ReturningObj;

public class Test {

	public static void main(String[] args) {
		demoClass ob = new demoClass(14,30);
		demoClass ob2;
		
		
		ob2 = ob.markUpdate(22);
		
		//ob2= ob.markUpdatee(ob);
		//System.out.println(ob);
		
		System.out.println(ob2);

	}

}


//output-1: demoClass [cse215=36, cse225=30]

//output-2: demoClass [cse215=22, cse225=0]