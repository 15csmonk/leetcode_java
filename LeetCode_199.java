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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        List<TreeNode> parentNode = new ArrayList<>(); 
        parentNode.add(root);
        while(parentNode.size() != 0){
            List<TreeNode> childNode = new ArrayList<>(); 
            Stack<Integer> stack = new Stack<>();
            for(TreeNode node : parentNode){
                stack.add(node.val);
                if(node.left != null){
                    childNode.add(node.left);
                }
                if(node.right != null){
                    childNode.add(node.right);
                }
            }
            if(stack.size() > 0){
                res.add(stack.pop());
            }
            parentNode = childNode;
        }
        return res;
    }
}