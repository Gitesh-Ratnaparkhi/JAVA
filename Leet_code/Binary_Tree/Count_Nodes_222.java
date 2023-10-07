package Binary_Tree;
// 222. Count Complete Tree Nodes
// Given the root of a complete binary tree, return the number of the nodes in the tree.
// According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
// Design an algorithm that runs in less than O(n) time complexity.

public class Count_Nodes_222{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value){
            val = value;
        }
    }
    public static int helper(TreeNode root){
        if(root == null) return 0;
        return 1 + helper(root.left) + helper(root.right) ;
        
    } 
    public static int countNodes(TreeNode root) {
        if(root == null) return 0;
        return helper(root);
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
        System.out.println(countNodes(root));
    }
}