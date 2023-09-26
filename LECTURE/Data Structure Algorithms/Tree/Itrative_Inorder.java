import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Itrative_Inorder {
    public static class Tree{
        int value ;
        Tree left ;
        Tree right;
        public Tree(int val){
            this.value = val;
        }
    }
    public static List<Integer> itrative_inorder_traversal(Tree root){
        List<Integer> array = new ArrayList<>();
        if(root == null)return array;
        Stack<Tree> st = new Stack<>();
        st.push(root);
        while(st.size() > 0){
            Tree temp = st.peek();
            if(temp .left != null){
                st.push(temp.left);
                temp.left = null;
            }
            else{
                st.pop();
                array.add(temp.value);
                if(temp.right != null) st.push(temp.right);
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Tree root = new Tree(1);
        Tree a = new Tree(2);
        Tree b = new Tree(3);
        root.left = a;
        root.right= b;
        Tree c = new Tree(4);
        Tree d = new Tree(5);
        a.left = c;
        a.right = d;
        Tree e = new Tree(6);
        Tree f = new Tree(7);
        b.left = e;
        b.right = f;
        List<Integer> arr = itrative_inorder_traversal(root);
        System.out.print(arr);
    }
}