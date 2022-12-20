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
    public int rob(TreeNode root) {
    
        //suppose root is null
        if(root==null) return 0;
        //upto now we didnt steel anything
        int tot=root.val;
        
        //now add grand child with root
        if(root.left !=null) tot+=rob(root.left.left)+rob(root.left.right);
        if(root.right !=null) tot+=rob(root.right.left)+rob(root.right.right);
        
        
        //return max of grand child or child
        return Math.max(tot,rob(root.left)+rob(root.right));
    }
}