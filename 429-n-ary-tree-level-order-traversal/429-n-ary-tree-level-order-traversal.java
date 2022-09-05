/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>(); 
        List<List<Integer>> ll = new LinkedList<>();
        if (root == null) {
            return ll;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size(); 
            List<Integer> current = new LinkedList<Integer>();
            for (int i = 0; i < n; i++) {
                Node node = q.poll();
                current.add(node.val); 
                q.addAll(node.children); 
            }
            ll.add(current); 
        }
        return ll;
    }
}