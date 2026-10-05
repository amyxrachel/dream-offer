class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int last = 0;
        int val = nums[0]+maxDiff;
        for(int i=0;i<n;i++) {
            if(val>= nums[i]){
            } else {
                last = i;
            }
            val = Math.max(val, nums[i]+maxDiff);
            nums[i] = last;
        }
    
        int q = queries.length;
        boolean[] result = new boolean[q];
        for(int i=0;i<q;i++){
            result[i] = (nums[queries[i][0]] == nums[queries[i][1]]);
        }
        return result;
    }
}