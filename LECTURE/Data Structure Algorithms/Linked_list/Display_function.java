public class Display_function {

    // creating the node of the class 
    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    //This is the function to display the link list 
    public static void Display_list(Node head) {
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
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
        a.next = b; //a --> b
        b.next = c; //a --> b --> c
        c.next = d; //a --> b --> c --> d
        d.next = e; //a --> b --> c --> d --> e
        e.next = f; //a --> b --> c --> d --> e --> f
        f.next = g; //a --> b --> c --> d --> e --> f --> g
        g.next = h; //a --> b --> c --> d --> e --> f --> g --> h       
        Display_list(a);
    }
}
