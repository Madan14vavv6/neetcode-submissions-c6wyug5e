class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> ans = new ArrayList<>();
       int[] hash = new int[nums.length];
       for(int i = 0; i < hash.length; i++){
            hash[nums[i] - 1]++;
       }
       for(int i = 0; i < hash.length; i++){
        if(hash[i]==0){
            ans.add(i+1);
        }
       }
       return ans; 
    }
}