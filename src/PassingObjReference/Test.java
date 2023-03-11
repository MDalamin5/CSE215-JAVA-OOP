package PassingObjReference;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demoClass obj = new demoClass(10, 20);
		System.out.println("Before Calling");
		obj.displayData();
		
		
		System.out.println("After Calling");
		obj.DataChangeByObjReff(obj);
		obj.displayData();
		
		

	}

}
