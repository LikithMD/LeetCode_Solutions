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
        TreeNode build(int[] in,int[] pos,int istart,int iend,int pstart,int pend) {
        if(istart>iend)
            return null;
        TreeNode tNode=new TreeNode(pos[pend]);
        if(istart==iend)
            return tNode;
        int inindex=search(in,istart,iend,tNode.val);
        tNode.left=build(in,pos,istart,inindex-1,pstart,pstart-istart+inindex-1);
        tNode.right=build(in,pos,inindex+1,iend,pend-iend+inindex,pend-1);
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        System.out.println(postorder.length-1);
        return build(inorder,postorder,0,inorder.length-1,0,inorder.length-1);
    }
}