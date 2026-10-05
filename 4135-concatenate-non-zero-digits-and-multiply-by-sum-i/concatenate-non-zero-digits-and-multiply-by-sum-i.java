class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long x=0;
        long itr=1;
        while(n>0){
            int digit = n%10;
            n/=10;
            sum+=digit;
            if(digit!=0){
                x+=digit*itr;
                itr*=10;
            }

        }
        return sum*x;
    }
}