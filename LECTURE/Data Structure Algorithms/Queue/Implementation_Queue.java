import java.util.*;
// The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order.
public class Implementation_Queue {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> queue = new LinkedList<>();
    System.out.println(queue.isEmpty());
    queue.add(1);
    System.out.println(queue.isEmpty());
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.add(6);
    System.out.println(queue.size());
    System.out.println(queue);
    queue.remove(); // remove method will remove element form starting of the queue 
    System.out.println(queue.size());
    System.out.println(queue);
    queue.poll(); // Note poll perform same opation as remove
    System.out.println(queue);
    System.out.println(queue.size());
    sc.close();
    }    
}
