public class Symmetric_Tree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static boolean isSame(Node p , Node q){
        if(p == null && q == null) return true;
        if(p == null || q == null)return false;
        if(p.val != q.val)return false;
        return isSame(p.left , q.left) && isSame(p.right , q.right);    
    }
    public static Node invertTree(Node root){
        if(root == null) return root;
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right = invertTree(l);
        return root;
    }
    public static boolean isSymmetric(Node root){
        if(root == null) return true;
        root.left = invertTree(root.left);
        return isSame(root.left , root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right= b;
        Node c = new Node(2);
        Node d = new Node(3);
        a.left = c;
        a.right = d;
        Node e = new Node(2);
        Node f = new Node(3);
        b.left = e;
        b.right= f;
        Node g = new Node(2);
        Node h = new Node(3);
        c.left = g;
        c.right = h;
        System.out.println(isSymmetric(root));
    }
}
