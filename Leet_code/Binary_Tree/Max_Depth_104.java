package Binary_Tree;

// 104. Maximum Depth of Binary Tree
// Given the root of a binary tree, return its maximum depth.
// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

public class Max_Depth_104{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            val = value;
        }
    }
    public static int maxDepth(TreeNode root) {
        if(root == null)return 0;
        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);  
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        a.left = c;
        a.right= d;
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        b.left = e;
        b.right = f;
        System.out.println(maxDepth(root));
    }
}