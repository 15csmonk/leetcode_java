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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        int level = 1;
        List<TreeNode> parentNode = new ArrayList<TreeNode>();
        parentNode.add(root);
        while(parentNode.size() != 0){
            List<TreeNode> childNode = new ArrayList<TreeNode>();
            List<Integer> list = new ArrayList<Integer>();
            for(TreeNode node : parentNode){
                list.add(node.val);
                if(node.left != null){
                    childNode.add(node.left);
                }
                if(node.right != null){
                    childNode.add(node.right);
                }   
            }
            if(level % 2 == 0){
                Collections.reverse(list);
            }
            if(list.size() > 0){
                res.add(list);
            }
            level ++;
            parentNode = childNode;
        }
        return res;
    }
}
