public class Desplaying_list {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Here we are creating the list
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);
        Node g = new Node(9);
        Node h = new Node(10);

        // here we are joining the node of the list
        a.next = b; // a --> b
        b.next = c; // a --> b --> c
        c.next = d; // a --> b --> c --> d
        d.next = e; // a --> b --> c --> d --> e
        e.next = f; // a --> b --> c --> d --> e --> f
        f.next = g; // a --> b --> c --> d --> e --> f --> g
        g.next = h; // a --> b --> c --> d --> e --> f --> g --> h
        Node temp = a;

        // Displaying using while loop
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // Displaying the list using for loop
        for (int i = 1; i <= 8; i++) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
