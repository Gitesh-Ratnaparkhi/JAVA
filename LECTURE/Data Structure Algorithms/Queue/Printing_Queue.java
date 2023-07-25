import java.util.*;
public class Printing_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        Queue<Integer>Helper = new ArrayDeque<>();
        while(queue.size()>0){
            System.out.println(queue.peek()+" ");
            Helper.add(queue.remove());
        }
        while(Helper.size()>0){
            queue.add(Helper.remove());
        }
    }
}
