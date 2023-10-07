package Binary_Tree;
import java.util.ArrayList;
import java.util.List;
// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
public class Binary_Tree_Level_Order_Traversal102 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            val = value;
        }
    }
    public int height(TreeNode root){
        if(root == null)return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public void helper(TreeNode root , int index , List<Integer> array){
        if(root == null) return ;
        if(index == 1){
            array.add(root.val);
            return ;
        }
        helper(root.left , index-1 , array);
        helper(root.right , index-1, array);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        int level = height(root);
        for(int  i = 1 ; i<= level ; i++){
            List<Integer> array = new ArrayList<>();
            helper(root , i , array);
            result.add(array);
        }
        return result ;
    }
}

