/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public Map<Integer, Integer> freq = new HashMap<>() ;

    private void dfs(TreeNode root) {
        if(root != null) {            
            freq.put(root.val, freq.getOrDefault(root.val, 0) + 1) ;
            dfs(root.left) ;
            dfs(root.right) ;
        }
    }

    public int[] findMode(TreeNode root) {
        dfs(root) ;
        int maxFreq = 0 ;
        for(Map.Entry<Integer, Integer> f : freq.entrySet()) {
            maxFreq = Math.max(maxFreq, f.getValue()) ;
        }
        List<Integer> ans = new ArrayList<>() ;
        for(Map.Entry<Integer, Integer> f : freq.entrySet()) {
            if(f.getValue() == maxFreq) {
                ans.add(f.getKey()) ;
            }
        }
        return ans.stream().mapToInt(i -> i).toArray() ;
    }

}