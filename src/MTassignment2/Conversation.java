package MTassignment2;

public class Conversation {

	    private boolean bye = false;

	    public synchronized void friend1Talks() {
	        try {
	            while (!bye) {
	                wait();
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Friend 1: Hey, how's everyone doing?");
	        notifyAll();
	    }

	    public synchronized void friend2Talks() {
	        try {
	            while (!bye) {
	                wait();
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Friend 2: We're good! What about you?");
	        notifyAll();
	    }

	    public synchronized void friend3Talks() {
	        try {
	            while (!bye) {
	                wait();
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Friend 3: I'm doing great! Thanks for asking.");
	        notifyAll();
	    }

	    public synchronized void endConversation() {
	        bye = true;
	        notifyAll();
	    }
}
