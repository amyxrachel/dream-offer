class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length - 1;
        Arrays.sort(nums);

        int lastThree = nums[n] * nums[n - 1] * nums[n - 2];
        int firstTwoAndLastOne = nums[0] * nums[1] * nums[n];

        return Math.max(lastThree, firstTwoAndLastOne);
    }
}