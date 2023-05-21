package MTassignment2;
import java.util.Scanner;
public class Main {
	
	 public static void main(String[] args) {
	        Conversation conversation = new Conversation();

	        Thread friend1 = new Thread(() -> {
	            conversation.friend1Talks();
	        });

	        Thread friend2 = new Thread(() -> {
	            conversation.friend2Talks();
	        });

	        Thread friend3 = new Thread(() -> {
	            conversation.friend3Talks();
	        });

	        friend1.start();
	        friend2.start();
	        friend3.start();

	        try {
	            Thread.sleep(1000); // Delay before ending conversation
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        conversation.endConversation();

	        try {
	            friend1.join();
	            friend2.join();
	            friend3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	 }

}
