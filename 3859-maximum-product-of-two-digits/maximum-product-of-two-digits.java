class Solution {
    public int maxProduct(int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        while(n > 0){
            int num = n % 10;
            pq.add(num);
            n /= 10;
        }

        return pq.remove() * pq.remove();

        
    }
}