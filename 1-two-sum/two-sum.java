class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        while (true) {
            for( int j = i+1 ; j < nums.length ; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }    
            i++;
        }
    }
}