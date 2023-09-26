import java.util.ArrayList;
import java.util.List;
public class DepthFirstSearch {
    public static class Node{
        int value ;
        Node left ;
        Node right; 
        public Node(int val){
            this.value = val;
        }
    }
    public static void helper(Node root , List<Integer> arr){
        if(root == null)return ;
        arr.add(root.value);
        helper(root.left ,arr);
        helper(root.right , arr);
    }
    public static List<Integer> inorder_Traversal(Node root){
        List<Integer> arr = new ArrayList<>();
        helper(root,arr);
        return arr;
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
        a.right= d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        List<Integer> arr = inorder_Traversal(root);
        System.out.println(arr);
    }
}