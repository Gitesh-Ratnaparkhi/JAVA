package Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class Binary_TreeZigzag_Level_Order_Traversal103 {
    public class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.value = val;
        }
    }
    public int height(TreeNode root){
        if(root == null)return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public void nth_odd_level(TreeNode root , int num , List<Integer> array){
        if(root == null)return ;
        if(num == 1){
            array.add(root.value);
            return ;
        }
        nth_odd_level(root.left , num - 1 , array);
        nth_odd_level(root.right , num - 1 , array);
    }
    public void nth_even_level(TreeNode root , int num , List<Integer> array){
        if(root == null)return ;
        if(num == 1){
            array.add(root.value);
            return ;
        }
        nth_even_level(root.right , num - 1 , array);
        nth_even_level(root.left , num - 1 , array);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        int level = height(root);
        if(root == null) return result ;
        for(int i = 1; i <= level ; i++){
            List<Integer> array = new ArrayList<>();
            if(i%2 != 0) nth_odd_level(root , i, array);
            else nth_even_level(root , i , array);
            result.add(array);
        }
        return result;
    }
}
