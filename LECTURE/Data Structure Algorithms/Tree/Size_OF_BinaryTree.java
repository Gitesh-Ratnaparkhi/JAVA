package Tree;
public class Size_OF_BinaryTree{
    public static class node{
        int val;
        node left;
        node right;
        public node(int val){
            this.val = val ;
        }
    }

    // Method to display the tree .
    public static void display(node root){
        if(root == null) return ;
        System.out.print(root.val+"-->");
        if(root.left!= null) System.out.print(root.left.val+" , ");
        if(root.right!=null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    } 

    // method to print the size of the tree.
    public static int size(node root){
        if(root == null) return 0 ; 
        return 1+size(root.left)+size(root.right);
    }
    public static void main(String[] args) {
        node root = new node(1);
        node a = new node(2);
        node b = new node(3);
        root.left = a;
        root.right = b;
        node c = new node(4);
        node d = new node(5);
        a.left = c;
        a.right= d;
        node e = new node(6);
        node f = new node(7);
        b.left = e;
        b.right = f;
        display(root);
        System.out.println(size(root));
    }
}