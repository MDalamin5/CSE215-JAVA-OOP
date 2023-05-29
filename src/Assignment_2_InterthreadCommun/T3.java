package Assignment_2_InterthreadCommun;

import java.util.Scanner;

class T3 implements Runnable {
    Chat m;
    String msg;

    public T3(Chat m1) {
        this.m = m1;
        new Thread(this, "Shahin: ").start();
    }

    Scanner scan = new Scanner(System.in);

    public void run() {
        while (true) {
            msg = scan.nextLine();
            String stop = "Bye";
            if (msg.equals(stop)) {
                m.terminate();
                break;
            }
            m.Answer(msg);
        }
    }

	
}
