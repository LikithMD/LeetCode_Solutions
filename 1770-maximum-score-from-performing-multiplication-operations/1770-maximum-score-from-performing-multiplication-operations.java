class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        int[][] op = new int[multipliers.length + 1][multipliers.length + 1];
		for (int i = multipliers.length - 1; i >= 0; i--) {
			for (int start = i, end = nums.length - 1; start >= 0; start--, end--) {
				int resStart = multipliers[i] * nums[start] + op[i + 1][start + 1];
				int resEnd = multipliers[i] * nums[end] + op[i + 1][start];
				op[i][start] = Math.max(resStart, resEnd);
			}
		}
		return op[0][0];
    }
}