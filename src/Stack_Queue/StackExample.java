package Stack_Queue;


import java.util.*;

public class StackExample {
   public static void main(String[] args) {
      Stack<Integer> stack = new Stack<int>();
      stack.push("element 1");
      stack.push("element 2");
      stack.push("element 3");
      System.out.println("Stack: " + stack);
      System.out.println("Top element: " + stack.peek());
      stack.pop();
      System.out.println("Stack after pop operation: " + stack);
   }
}
