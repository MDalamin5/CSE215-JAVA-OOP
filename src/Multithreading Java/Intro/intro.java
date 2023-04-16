
public class intro extends Thread {
    intro()
    {

    }
    public void run()
    {
        System.out.println("Here i just wrinte the code for updateing ");
        for(int i=0;i<=4;i++)
        {
            if(i%2!=0)
            {
                System.out.println("i==>"+i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        intro t1= new intro();
        t1.start();
    }
    
}
