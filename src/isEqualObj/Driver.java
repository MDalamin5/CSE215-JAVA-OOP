package isEqualObj;

public class Driver {

	public static void main(String[] args) {
		Test ob1 = new Test(2,4);
		Test ob2 = new Test(2,4);
		Test ob3 = new Test(3,3);
		Test2 ob4 = new Test2(2,4);
		
		//boolean res = ob1.isEqual(ob2);
		//System.out.println(res);
		
		//System.out.println(ob2.isEqual(ob3));
		
		//System.out.println(ob4.isEqqual(ob4));
		//ob4.isEqqual(ob4);
		
		System.out.println("Before Call");
		System.out.println(ob1);
		
		//ob1.valueUpdate(ob1);
		Test ob5 = ob1.updateValue(ob1);
		
		System.out.println("After Call");
		System.out.println(ob5);
	}

}
