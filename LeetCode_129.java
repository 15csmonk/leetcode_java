/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        return preOrder(root,0);
    }
    public int preOrder(TreeNode root,int sum){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null) {
            return sum * 10 + root.val;
        }
        return preOrder(root.right,sum * 10 + root.val) + preOrder(root.left,sum * 10 + root.val);
    }
}