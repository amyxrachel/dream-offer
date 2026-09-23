class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length, total = 0;
        for(int num : nums) total +=num;
        int target = total-x;
        if(total<0) return -1;
        if(target==0) return n;
        int maxLen = -1, left = 0, currSum = 0;
        for(int right = 0;right<n;right++){
            currSum+=nums[right];
          while(currSum>target && left<=right){
            currSum-=nums[left++];
          }
          if(currSum==target){
            maxLen = Math.max(maxLen,right-left+1);
          }
        }
    return (maxLen==-1) ? -1:n-maxLen;
    }
}