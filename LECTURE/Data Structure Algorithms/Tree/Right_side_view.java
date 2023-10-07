import java.util.ArrayList;
import java.util.List;

public class Right_side_view {
    public static class Node {
        int value ;
        Node left ;
        Node right ;
        public Node(int val){
            this.value = val ;
        }
    }

    // Function to display the tree.
    public static void display(Node root){
        if(root == null) return ;
        System.out.print(root.value+"-->");
        if(root.left!= null) System.out.print(root.left.value+" , ");
        if(root.right!=null) System.out.print(root.right.value);
        System.out.println();
        display(root.left);
        display(root.right);
    }

    // Function to get the height of the binary tree.
    public static int height (Node root){
        if(root == null )return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    //Function to add all right side element in the array List.
    public static void preorder(Node root , List<Integer> array , int level){
        if(root == null) return ;
        array.set(level - 1 , root.value);
        preorder( root.left, array, level + 1);
        preorder(root.right, array, level + 1);
    }

    // Finction to view the right side of the binary tree.
    public static List<Integer> right_side_view(Node root){
        List<Integer> array = new ArrayList<>();
        if(root == null)return array;
        int level = height(root);
        for(int i = 0 ; i< level ;i++){
            array.add(100);
        }
        preorder(root , array , 1);
        return array;
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
        Node g = new Node(8);
        Node h = new Node(9);
        c.left = g;
        c.right = h;
        Node i = new Node(10);
        Node j = new Node(11);
        d.left = i;
        d.right = j;
        display(root);
        System.out.println(right_side_view(root));
    }
}
