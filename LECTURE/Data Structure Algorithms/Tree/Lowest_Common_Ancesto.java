public class Lowest_Common_Ancesto {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int val){
            this.value = val;
        }
    } 
    
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(1);
        Node b = new Node(2);
        root.left = a;
        root.right = b;
        Node c = new Node(3);
        Node d = new Node(4);
        a.left = c;
        a.right = d;
        Node e = new Node(5);
        Node f = new Node(6);
        b.left = e;
        b.right = f;

    }
}
