
public class Postorder {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }   
    }
    public static void post_order(Node root){
        // post order --> left right root
        if(root == null) return;
        post_order(root.left);
        post_order(root.right);
        System.out.println(root.val);    
    }
   
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right= b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        System.out.println("Post order travelsel is ");
        post_order(root);
    }   
}
