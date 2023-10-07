package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree_Level_Order_TraversalII_107 {
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        int level = height(root);
        for(int  i = level ; i >= 1 ; i--){
            List<Integer> array = new ArrayList<>();
            helper(root , i , array);
            result.add(array);
        }
        return result ;
    }
}
