public class InsertAt_Beginning {

    // this is class Node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // class link list start from here
    public static class LinkList {
        Node head = null;
        Node tail = null;

        // function to all element at the beginning of the link list
        void InsertAt_Beginning(int val) {
            Node temp = new Node(val);
            if (head == null)
                head = tail = temp; // If head and tail is pointing to null then if we insert first element then
                                    // both head and tail will point to that number.
            else
                temp.next = head; // after add 1 element in the linklist then we have to move head by one step .
            head = temp; // 57 --> 4
        }

        // method to display the link list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.InsertAt_Beginning(4);
        list.InsertAt_Beginning(57);
        list.InsertAt_Beginning(34);
        list.InsertAt_Beginning(5);
        list.InsertAt_Beginning(6);
        list.InsertAt_Beginning(8);
        list.InsertAt_Beginning(9);
        list.InsertAt_Beginning(12);
        list.display();
    }
}

// Dry run of the code
// first call 4
// second call 57 --> 4
// third call 34 --> 57 --> 4
// forth call 5 --> 34 --> 57 --> 4
// fifth call 6 --> 5 --> 34 --> 57 --> 4
// sixth call 8 --> 6 --> 5 --> 34 --> 57 --> 4
// seventh call 9 --> 8 --> 6 --> 5 --> 34 --> 57 --> 4
// eightth call 12 --> 9 --> 8 --> 6 --> 5 --> 34 --> 57 --> 4
// NOTE Head will point to 12 and Tail will point to 4