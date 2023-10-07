public class Inver_Binary_tree {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int val){
        this.value = val;
        }
    } 
    public static Node invertTree(Node root) {
        if(root == null) return root;
        Node left_temp = root.left;
        root.left = root.right;
        root.right = left_temp;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
    public static void inorder(Node root){
        // inorder --> first left , second root , third right
        if(root == null) return ;
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        inorder(root);
        System.out.println("Tree after inverting is : ");
        inorder(invertTree(root));
    }
}
   
