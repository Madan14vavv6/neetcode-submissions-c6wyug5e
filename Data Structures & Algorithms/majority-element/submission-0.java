class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            if(max ==  temp){
                cnt++;
            }
            else if(max != temp && cnt != 0){
                cnt--;
            }
            else{
                max = nums[i];
                cnt++;
            }
        }
        return max;
    }
}