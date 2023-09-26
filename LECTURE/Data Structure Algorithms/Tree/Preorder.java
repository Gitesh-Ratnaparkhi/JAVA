
public class Preorder {
    // creating node 
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }   
    }
    public static void Tree_Print(Node root){
        if(root == null ) return ;
        System.out.print(root.val + "-->");
        if(root.left!=null) System.out.print(root.left.val + " , ");
        if(root.right!=null) System.out.println(root.right.val + " , ");
        Tree_Print(root.left);
        Tree_Print(root.right);
    }
    public static void preorder(Node root){
        // pre order is root left right
        // base case 
        if(root == null) return ;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
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
    }
}
