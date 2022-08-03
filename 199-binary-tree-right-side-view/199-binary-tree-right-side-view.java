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
    public void rightview(TreeNode curr,List<Integer> ds,int h) {
        if(curr==null)
            return;
        if(h==ds.size())
            ds.add(curr.val);
        rightview(curr.right,ds,h+1);
        rightview(curr.left,ds,h+1);
    }
    List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        rightview(root,ans,0);
        return ans;
    }
}