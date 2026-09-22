class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        com(candidates,target,new ArrayList<>(),0);
        return ans;
        
    }
    void com(int[] candidates,int target,List<Integer> path,int start){
        if(target==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]<=target){
                path.add(candidates[i]);
                com(candidates,target-candidates[i],path,i+1);
                path.remove(path.size()-1);
            }
        }

    }
}