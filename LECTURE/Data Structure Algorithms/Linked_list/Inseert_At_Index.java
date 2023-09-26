import java.util.Scanner;

public class Inseert_At_Index {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkList {
        // Creating two pointer as head and tail
        Node head = null;
        Node tail = null;

        // method to Insert element at the end of the link list 
        void Inseert_At_End(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp; // this line will assign the value to the head when head is pointing to null
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void instert_at_head(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // method to insert element at the any given index of the link list 
        void insert_at_index(int index, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (index == size()) {
                Inseert_At_End(val);
                return;
            } else if (index == 0) {
                instert_at_head(val);
                return;
            } else if (index < 0 || index > size()) {
                System.out.println("Wrong index");
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        // This function give the size of the linklist
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkList ll = new linkList();
        ll.Inseert_At_End(45);
        ll.Inseert_At_End(6665);
        ll.Inseert_At_End(90);
        ll.instert_at_head(67);
        ll.instert_at_head(35);
        ll.insert_at_index(4, 10);
        ll.display();
        sc.close();
    }
}
