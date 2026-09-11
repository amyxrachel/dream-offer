class Solution {
    public int[] plusOne(int[] digits) {
        var len = digits.length;
        for(int i= len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i] +=1;
                return digits;
            }
            else{
                digits[i] = 0; // carry over
            }  
        }
        int[] result = new int[len+1];
        result[0] = 1;
        return result;
    }
}