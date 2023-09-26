
public class Max_Value_Tree {
    public static class node{
        int val;
        node left;
        node right;
        public node(int val){
            this.val = val;
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

   
    public static int Max_value(node root){
        if(root== null)return Integer.MIN_VALUE;
        int a = root.val;
        int b = Max_value(root.left);
        int c = Max_value(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        node root = new node(1);
         // child of root --> a, b
        node a = new node(2);
        node b = new node(3);
        root.left = a;
        root.right = b;

        // child of a --> c , d 
        node c = new node(4);
        node d = new node(5);
        a.left = c;
        a.right = d;

        // child of b --> e , f
        node e = new node(6);
        node f = new node(7);
        b.left = e;
        b.right = f;
        display(root);
        System.out.println("Max value of the tree is "+Max_value(root));
    }
}
