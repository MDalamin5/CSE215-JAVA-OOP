package MultiThreadAssignment;

import java.util.Scanner;

class Friend extends Thread {
    private String name;
    private Friend nextFriend;

    public Friend(String name) {
        this.name = name;
    }

    public void setNextFriend(Friend nextFriend) {
        this.nextFriend = nextFriend;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            synchronized (this) {
                try {
                    System.out.println(name + ": Hey, guys! What do you think about the canteen food?");
                    String response = scanner.nextLine();
                    if (response.equalsIgnoreCase("bye")) {
                        System.out.println(name + ": Okay, bye!");
                        nextFriend.interrupt();
                        break;
                    }
                    System.out.println(name + ": Interesting point, " + nextFriend.getName() + "! What about you, " + nextFriend.getName() + "?");
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(name + ": Oops, seems like " + nextFriend.getName() + " left. " + "Let's continue the conversation, " + nextFriend.getName() + "!");
                }
            }
        }
    }
}


