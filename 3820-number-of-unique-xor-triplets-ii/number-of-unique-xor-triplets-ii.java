class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] pairReach = new boolean[2048];
        boolean[] ans = new boolean[2048];

        for (int k = 0; k < nums.length; k++) {
            for (int i = 0; i <= k; i++) {
                pairReach[nums[i] ^ nums[k]] = true;
            }
            for (int x = 0; x < 2048; x++) {
                if (pairReach[x]) {
                    ans[x ^ nums[k]] = true;
                }
            }
        }

        int count = 0;
        for (boolean v : ans) {
            if (v) count++;
        }
        return count;
    }
}