package MultiThreadAssignment;

class CanteenConversation {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Friend 1");
        Friend friend2 = new Friend("Friend 2");
        Friend friend3 = new Friend("Friend 3");

        friend1.setNextFriend(friend2);
        friend2.setNextFriend(friend3);
        friend3.setNextFriend(friend1);

        friend1.start();
        friend2.start();
        friend3.start();
    }
}