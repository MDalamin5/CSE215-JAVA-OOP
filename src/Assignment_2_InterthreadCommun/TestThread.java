package Assignment_2_InterthreadCommun;

public class TestThread {
    public static void main(String[] args) {

        Chat m = new Chat();
        T1 t1 = new T1(m);
        T2 t2 = new T2(m);
        T3 t3 = new T3(m);

        // Wait for any thread to terminate
        
    }
}
