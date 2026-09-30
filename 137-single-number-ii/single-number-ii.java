class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<32; i++){
            int sum = 0;
            for(int x: nums){
                sum += (x >> i) & 1;
            }
            if(sum % 3 == 1){
                ans |= 1 << i;
            }
        }
        return ans;
    }
}