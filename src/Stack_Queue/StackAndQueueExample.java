package Stack_Queue;

import java.util.*;

public class StackAndQueueExample {
   public static void main(String[] args) {
      // Stack example for integer data type
      Stack<Integer> s = new Stack<Integer>();
      

      // Queue example for integer data type
      Queue<Integer> q = new LinkedList<Integer>();
      s.push(5);
      s.push(6);
      s.push(s.peek());
      s.push(7);
      q.add(s.pop());
      q.add(5);
      q.add(6);
      System.out.print(q.peek());
      s.push(q.remove());
      System.out.print(s.pop());
      s.pop();
      System.out.print(s.pop());
   }
}

