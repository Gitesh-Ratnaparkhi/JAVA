package Binary_Tree;
// A binary tree is uni-valued if every node in the tree has the same value.
// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
public class Univalued_Binary_tree_Easy965{
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            val = value;
        }
    }
    public boolean helper(TreeNode root , int num) {
        if(root == null) return true;
        if(root.val != num)return false;
        else return helper(root.left , num) && helper(root.right ,num);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)return true;
        return helper(root ,root.val);
    }
}