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
    int pindex=0;
    TreeNode build(int[] in,int[] pre,int start,int end) {
        if(start>end)
            return null;
        TreeNode tNode=new TreeNode(pre[pindex++]);
        if(start==end)
            return tNode;
        int inindex=search(in,start,end,tNode.val);
        tNode.left=build(in,pre,start,inindex-1);
        tNode.right=build(in,pre,inindex+1,end);
        return tNode;
    }
    int search(int[] arr,int st,int en,int value) {
        int i;
        for(i=st;i<=en;i++) {
            if(arr[i]==value)
                return i;
        }
        return i;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(inorder,preorder,0,preorder.length-1);
    }
}