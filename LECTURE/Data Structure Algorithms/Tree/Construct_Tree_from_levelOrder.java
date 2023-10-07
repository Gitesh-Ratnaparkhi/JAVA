import java.util.LinkedList;
import java.util.Queue;
public class Construct_Tree_from_levelOrder {
    
    // Creating the Node class
    public static class Node{
        int value;
        Node left ;
        Node right;
        public Node(int val){
            this.value = val;
        }
    }

    // Function to calculate the height of the tree.
    public static int height(Node root){
        if(root == null)return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // This function print the tree in level order.
    public static void nth_level(Node root , int n){
        if(root == null)return ;
        if(n == 1){
            System.out.print(root.value+" ");
            return ;
        }
        nth_level(root.left, n-1);
        nth_level(root.right, n-1);
    }

    // This function will print the tree
    public static void display(Node root){
        if(root == null) return ;
        System.out.print(root.value+"-->");
        if(root.left!= null) System.out.print(root.left.value+" , ");
        if(root.right!=null) System.out.print(root.right.value);
        System.out.println();
        display(root.left);
        display(root.right);
    }

    // This function will create the tree
    public static Node construct_bt(String[] array){
        int x = Integer.parseInt(array[0]); // This will convert the first value of the array to integer.
        int n = array.length;
        Node root = new Node(x); // First element of the array we will give as root .
        Queue<Node> q = new LinkedList<>(); // is the only one knowing which concrete implementation of list lies behind the variable q, which behaves like a Queue - each consecutively code can only use the API of Queue when working with q.
        q.add(root);
        int i = 1;
        while(i < n - 1){
            Node temp =  q.remove();
            Node left = new Node (10);
            Node right = new Node (100);
            if(array[i].equals(" ")){
                left = null;
            }else{
                int l = Integer.parseInt(array[i]);
                left.value = l;
                q.add(left);
            }
            if(array[i+1].equals(" ")){
                right = null;
            }else{
                int r = Integer.parseInt(array[i+1]);
                right.value = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }

    public static void main(String[] args) {
        String array[] = {"1","2","3","4","5","6","7"," ","8"," "," "," ","9"," "};
        Node root = construct_bt(array);
        int level = height(root) ;
        for(int i = 1; i<=level ; i++){
            nth_level(root , i);
        }
        System.out.println("");
        display(root);
    }
}