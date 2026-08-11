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
    private static void helper(List<Integer> res,TreeNode root){
        if(root==null) return;
        helper(res,root.left);
        res.add(root.val);
        helper(res,root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(res,root);
        return res;

        // List<Integer> res=new ArrayList<>();
        // if(root==null) return res;
        // Stack<TreeNode> stack=new Stack<>();
        // TreeNode node=root;
        // while(true){
        //     if(node!=null){
        //         stack.push(node);
        //         node=node.left;
        //     }else{
        //         if(stack.isEmpty()){
        //             break;
        //         }
        //         node=stack.pop();
        //         res.add(node.val);
        //         node=node.right;
        //     }
        // }
        // return res;
    }
}