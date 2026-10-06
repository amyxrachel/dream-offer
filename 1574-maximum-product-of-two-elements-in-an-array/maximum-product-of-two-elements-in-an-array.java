class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;

                }
            }
        }
        int a=nums[n-1];
        int b=nums[n-2];
        int res=(a-1)*(b-1);
        return res;
    }
}