package PassingValue;

public class Test {

	public static void main(String[] args) {
		Operation ob = new Operation();
		System.out.println(ob.data);
		//ob.data=100;
		System.out.println("After changeing value");
		ob.change(ob);
		System.out.println(ob.data);
		System.out.println(ob.name);

	}

}
