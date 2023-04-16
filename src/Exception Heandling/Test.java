

public class Test {
    String name;
    int age;
    Test(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name: "+name+" \n"+"Age: "+age);
    }
    public static void main(String[] args) {
       // System.out.println("Hello");
       Test ob = new Test("Al Amin", 23);
       ob.display();
        
        
    }
    
}
