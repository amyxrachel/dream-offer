class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> rm=new HashMap<>();
        int arr1[]=arr.clone();
        Arrays.sort(arr1);
        int rank=1;
        for(int num:arr1){
            if(!rm.containsKey(num)){
            rm.put(num,rank);
            rank++;
            }
        }
        int res[]=new int[arr.length];
        for(int i=0;i<n;i++){
            res[i]=rm.get(arr[i]);
        }
        return res;
    }
}