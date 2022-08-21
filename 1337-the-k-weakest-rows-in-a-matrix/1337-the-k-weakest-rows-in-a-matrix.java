class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> sumOfMt = new HashMap<Integer,Integer>();
	    int[] weakestRows;
	
	    for(int i=0;i<mat.length;i++){
			sumOfMt.put(i,Arrays.stream(mat[i]).sum());
	    }
        
         weakestRows = sumOfMt.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .mapToInt(Map.Entry::getKey)
                .limit(k)
                .toArray();
        
        return weakestRows;
    }
}