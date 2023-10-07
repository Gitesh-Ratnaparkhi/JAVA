public /**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/
class Solution {
   public boolean check(TreeNode p ,  TreeNode q){
       if(p == null && q.right == null)return true ;
       if(p.left == null || q.right == null) return false;
       if(p.val != p.val) return false;
       return check(p.left , q.left) && check(p.right , q.right);
   }
   public TreeNode invert(TreeNode root){
       if(root == null)return root;
       TreeNode l = root.left;
       root.left = root.right;
       root.right = l;
       root.left = invert(root.left);
       root.right = invert(root.right);
       return root;
   }
   public boolean isSymmetric(TreeNode root) {
       if(root == null)return true;
       root.left = invert(root.left);
       return check(root.left , root.right);
   }
} {
    
}
