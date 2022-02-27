import java.util.LinkedList;
import java.util.Queue;

public class Queue_01 {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(9);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());

    }
}
