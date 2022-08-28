class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                PriorityQueue<Integer> pq = map.getOrDefault(i-j, new PriorityQueue<>());
                pq.add(mat[i][j]);
                map.put(i-j, pq);
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                mat[i][j]=map.get(i-j).poll();
            }
        }
        return mat;
    }
}