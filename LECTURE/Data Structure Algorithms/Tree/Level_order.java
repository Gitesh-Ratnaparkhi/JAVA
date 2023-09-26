public class Level_order {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        } 
    }
    public static void level_order(Node root, int n){
        if(root==null)return;
        if(n==1){
            System.out.println(root.val+" ");
            level_order(root.left, n - 1);
            level_order(root.right, n - 1);
        }
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
        System.out.println("Post order travelsel is ");    
    }
    
}
