package Assignment_2_InterthreadCommun;

import java.util.Scanner;

class T1 implements Runnable {
    Chat m;
    String msg;

    public T1(Chat m1) {
        this.m = m1;
        new Thread(this, "Al Amin: ").start();
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
            m.Question(msg);
        }
    }

	
}