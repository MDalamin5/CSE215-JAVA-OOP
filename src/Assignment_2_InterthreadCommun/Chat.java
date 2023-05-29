package Assignment_2_InterthreadCommun;

public class Chat {
    boolean flag = false;
    boolean terminated = false;

    public synchronized void Question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + msg);
        flag = true;
        notify();
    }

    public synchronized void Answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + msg);
        flag = false;
        notifyAll();
    }

    public synchronized void terminate() {
        terminated = true;
        notifyAll();
    }

    public synchronized boolean isTerminated() {
        return terminated;
    }
}
