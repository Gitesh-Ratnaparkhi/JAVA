package Tree;

// Height of the binary tree 
public class Hight_Of_binaryTree{

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
    // This function will return the height of the binary tree. 
    public static int height_OfBinaryTree(Node root){
        if(root == null) return 0 ;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height_OfBinaryTree(root.left),height_OfBinaryTree(root.right));
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
        Tree_Print(root);
        System.out.println("The height of the binary tree is : "+height_OfBinaryTree(root));
    }
}