class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> ans1 = new HashMap<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            ans1.put(nums[i],ans1.getOrDefault(nums[i],0)+1);
            if(ans1.get(nums[i]) == k){
                temp.add(nums[i]);
            }
        }
        int[] ans = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            ans[i] = temp.get(i);
        }


        return ans;
    }
}
