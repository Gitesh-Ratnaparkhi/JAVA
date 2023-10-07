public class Balanced_Binary_tree {

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

    // This function will return the height of the binary tree.
    public static int height(Node root){
        if(root == null)return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Function to find Weather the tree is balanced or not. This function will return true if the tree is balanced.
    public static boolean isBalanced(Node root){
        if(root == null)return true;
        int lefth = height(root.left);
        if(root.left!=null) lefth++;
        int rigthh = height(root.right);
        if(root.right!=null) rigthh++;
        int res = lefth - rigthh;
        if(res < 0) res -=res;
        if(res > 0) return false;
        return(isBalanced(root.left) && isBalanced(root.right));
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
        System.out.println(isBalanced(root));
    }
}
