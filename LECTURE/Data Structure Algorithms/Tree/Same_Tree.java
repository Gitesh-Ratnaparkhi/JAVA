public class Same_Tree {

    // Creating the Node of The binary tree .
    public static class Node {
        int value ;
        Node left ;
        Node right;
        // Node Class Constructer 
        public Node(int val){
            this.value = val;
        }
    }

    public static boolean is_Same_Tree(Node p , Node q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.value != q.value) return false;
        return is_Same_Tree(p.left , q.left) && is_Same_Tree(p.right , q.right);
    }
    public static void main(String[] args){
        // Creating the object of the class Node and assigning the value to Node.
        Node root = new Node(0);
        Node a = new Node(1);
        Node b = new Node(1);
        root.left = a;
        root.right = b;
        Node c = new Node(2);
        Node d = new Node(3);
        a.left = c;
        a.right = d;
        Node e = new Node(3);
        Node f = new Node(4);
        b.left = e;
        b.right = f;
        Node g = new Node(4);
        Node h = new Node(5);
        c.left = g;
        c.right = h;
    }
}