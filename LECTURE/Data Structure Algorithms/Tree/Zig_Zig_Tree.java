import java.util.ArrayList;
import java.util.List;

public class Zig_Zig_Tree {
    // This is the class node
    public static class Node{
        int value ;
        Node left;
        Node right;
        Node(int val){
            this.value = val;
        }
    }

    // This function gives the height of the tree
    public static int height(Node root){
        if(root == null)return 0;
        return 1 + Math.max(height(root.left) , height(root.left));
    }

    // This function is for all even values 
    public static void nthlevel(Node root , int n , List<Integer> array){
        if(root == null) return ;
        if(n == 1){
            array.add(root.value);
            return ;
        }
        nthlevel(root.left , n - 1, array);
        nthlevel(root.right , n - 1 , array);
    }

    // This function is for all odd values 
    public static void nthlevel2(Node root , int n , List<Integer> array){
        // root to left 
        if(root == null)return ;
        if(n == 1){
            array.add(root.value);
            return ;
        }
        nthlevel2(root.right , n-1 , array);
        nthlevel2(root.left , n-1 , array);
    }

    // main function zig zag order 
    public static List<List<Integer>> Zig_zag_level_order(Node root) {
        int level = height(root);
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        for(int i = 1 ; i<= level ; i++){
            List<Integer> array = new ArrayList<>();
            if(i%2!=0)nthlevel(root, i, array); // for all odd values 
            else nthlevel2(root , i ,array);    // for all even values 
            result.add(array);
        }
        return result;
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
        System.out.println(Zig_zag_level_order(root));
                                            //                root 
                                            //         a                 b
                                            //    c          d       e            f
                                        //  g           h
    }
}