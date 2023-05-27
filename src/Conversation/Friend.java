package Conversation;

import java.util.Scanner;

class Friend extends Thread {
    private String name;
    Friend nextFriend;
    private boolean bye = false;

    public Friend(String name, Friend nextFriend) {
        this.name = name;
        this.nextFriend = nextFriend;
    }

    public synchronized void say(String message) {
        System.out.println(name + ": " + message);

        if (message.equalsIgnoreCase("bye")) {
            bye = true;
            nextFriend.interrupt();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                // Interrupted by another friend saying "bye"
            }
        }
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (!bye) {
            System.out.print(name + ": ");
            String message = scanner.nextLine();
            say(message);
        }
        System.out.println(name + " left the conversation.");
    }
}
