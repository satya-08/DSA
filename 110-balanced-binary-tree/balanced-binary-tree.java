/**
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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return heightdiff(root)!=-1;
        // int leftheight=MaxDepth(root.left);
        // int rightheight=MaxDepth(root.right);
        // if(Math.abs(leftheight-rightheight)>1){
        //     return false;
        // }
        // boolean left=isBalanced(root.left);
        // boolean right=isBalanced(root.right);
        // if(!left||!right) return false;
        // return true;
    }
    private static int heightdiff(TreeNode root){
        if(root==null) return 0;
        int lh=heightdiff(root.left);
        if(lh==-1) return -1;
        int rh=heightdiff(root.right);
        if(rh==-1) return -1;
        if(Math.abs(rh-lh)>1) return -1;
        return (1+Math.max(heightdiff(root.left),heightdiff(root.right)));
    }
}