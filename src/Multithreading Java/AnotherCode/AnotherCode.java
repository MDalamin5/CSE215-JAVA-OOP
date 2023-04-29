
//import java.lang.*;
public class AnotherCode implements Runnable {
  
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        AnotherCode ob = new AnotherCode();
        Thread th = new Thread(ob);
        th.start();
    }
    
}
