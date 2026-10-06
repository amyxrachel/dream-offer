class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        int count=0;
        int zcount=0;
        int max=0;
        s=s+"1";
        List<Integer> lt=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zcount++;
            }else{
                count++;
                if(zcount>0){
                   lt.add(zcount);
                }
                zcount=0;
            }
        }
        if(zcount>0){
            lt.add(zcount);
        }
        if(lt.size()==1){
            return count;
        }
        for(int i=1;i<lt.size();i++){
            max=Math.max(max,lt.get(i)+lt.get(i-1));
        }
        return max+count;
        

    }
}