class Solution {
    public int reverse(int x) {
        long temp = (long)x;
        long sum = 0;
        while(Math.abs(temp)>0){
            long rem = temp%10;
            sum = sum*10 + rem;
            temp /= 10;
        }
        if(sum<(long)(Math.pow(2,31)-1) && sum>(long)(Math.pow(-2,31)))
        return (int)sum;
        else
        return 0;
    }
}