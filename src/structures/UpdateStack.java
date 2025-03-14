package structures;

import java.util.Deque;
import java.util.LinkedList;

//you're given a Stack of integers
//Remove the integer at the top of the stack and replace it with another number.

public class UpdateStack {

    public static Deque<Integer> updateStack(Deque<Integer> stack, int newPop) {
        stack.pop();
        stack.push(newPop);
        return stack;
    }


    public static void main(String[] args) {
        Deque<Integer> miPila = new LinkedList<Integer>();
        miPila.add(5);
        miPila.add(4);
        miPila.add(3);
        miPila.add(2);
        miPila.add(1);

        int newTop = 6;
        Deque<Integer> result = updateStack(miPila,newTop);
        System.out.println(result.peek());

    }
}
