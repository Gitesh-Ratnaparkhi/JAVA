package Binary_Tree;
// 100. Same Tree
// Given the roots of two binary trees p and q, write a function to check if they are the same or not.
// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)return true;
        if(p == null || q == null)return false;
        if(p.val!=q.val)return false;
        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }
}