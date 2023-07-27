// write a program to implement stacks using vector

import java.util.Stack;
import java.util.Vector;


public class stacks {

    public static void main(String[] args) {
        // search element
        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("C");

        System.out.println(stack);

        stack.pop();
        stack.pop();
        // pop() removes the last element from the stack
        // remove() removes the element at the specified index
        // peek() returns the last element from the stack
        // empty() checks if the stack is empty
        // search() returns the index of the element
        // push() adds an element to the stack
       

        //print using for loop
        System.out.println("using for loop");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
         String s1 = stack.peek();
        System.out.println("Peeking: "+s1);
        System.out.println(stack);

        // using for each loop

        System.out.println("using for each loop");
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
