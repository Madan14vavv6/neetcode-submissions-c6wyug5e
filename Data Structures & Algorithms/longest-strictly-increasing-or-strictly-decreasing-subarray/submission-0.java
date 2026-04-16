class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int i = 1, len = 1, max = 0;
        while(i < nums.length){
            if(nums[i-1] > nums[i]){
                len++;
                i++;
            }
            else{
                max = Math.max(max,len);
                len=1;
                i++;
            }
        }
        max = Math.max(len,max);
        len=1;
        while(i > nums.length){
            if(nums[i-1] > nums[i]){
                len++;
                i++;
            }
            else{
                max = Math.max(max,len);
                len=1;
                i++;
            }
        }
        max = Math.max(len,max);
        return max;
    }
}