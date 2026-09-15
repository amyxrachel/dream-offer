class Solution {
    public int maxArea(int[] input) {
      int l = 0, r = input.length-1;
        int max = 0;

        while(l < r){
            max = Math.max(Math.min(input[l], input[r]) * (r-l), max);
            if(input[l] <  input[r]) l++;
            else r--;
        }
        return max;
    }
}