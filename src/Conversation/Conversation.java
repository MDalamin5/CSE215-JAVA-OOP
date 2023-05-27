
package Conversation;
public class Conversation {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Friend 1", null);
        Friend friend2 = new Friend("Friend 2", friend1);
        Friend friend3 = new Friend("Friend 3", friend2);

        friend1.nextFriend = friend3;

        friend1.start();
        friend2.start();
        friend3.start();
    }
}