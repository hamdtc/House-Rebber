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
        
        //save two number which is sum of childs or grand child with root
        //Here second element is sum of grand child 
        //first sum of child
    int ans[]=letsRob(root);
    return Math.max(ans[1],ans[0]);
        
    }
    
    public int[] letsRob(TreeNode root){
        if(root == null){
            return new int[2];
            //no element so that both is zero
        }
        //now rob left and right child
        int left[] = letsRob(root.left);
        int right[] =letsRob(root.right);
        
        //to save in the root node and sum with itself
        //second element -> root + grand child
        //first element -> sum of child node
        int ans[] = new int[2];
        
        ans[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        ans[1] = root.val+left[0]+right[0];
        
        return ans;
        
    }
}