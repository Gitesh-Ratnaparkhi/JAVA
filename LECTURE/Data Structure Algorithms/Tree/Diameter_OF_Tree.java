// Finding the Diameter of the Binary tree.
public class Diameter_OF_Tree {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int val){
            this.value = val;
        }
    } 
    public static int height(Node root){
        if(root == null || (root.left== null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static int Diameter_tree(Node root){
        if(root == null || (root.left== null && root.right == null)) return 0;
        int left  = Diameter_tree(root.left);
        int right = Diameter_tree(root.right);
        int mid = height(root.left) + height(root.right);
        if(root.left != null) mid++;
        if(root.right != null) mid++;
        return Math.max(left, Math.max(right, mid));
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
        System.out.print("The Diameter of the binary Tree is : "+Diameter_tree(root));
    }
}
