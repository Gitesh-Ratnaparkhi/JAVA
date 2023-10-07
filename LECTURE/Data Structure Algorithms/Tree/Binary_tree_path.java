import java.util.ArrayList;
import java.util.List;

public class Binary_tree_path {
    public static class Node{
            int value;
            Node left;
            Node right;
            public Node(int val){
                this.value = val;
            }
        } 
        public static void Path_Binary_tree(Node root , List<String> arr , String s){
            if(root == null) return ;
            if(root.left == null && root.right== null){
                // assigning the value to the given string s.
                s += root.value;
                arr.add(s);
                return ;
            }
            Path_Binary_tree(root.left , arr , s + root.value + "-->");
            Path_Binary_tree(root.right, arr, s+root.value +"-->");
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
        List<String> arr = new ArrayList<>();
        Path_Binary_tree(root,arr," ");
        for(int i = 0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }
    }
}
