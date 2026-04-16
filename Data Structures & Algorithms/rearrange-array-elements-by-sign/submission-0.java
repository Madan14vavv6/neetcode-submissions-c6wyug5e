class Solution {
    public int[] rearrangeArray(int[] nums) {
        int neg = 0, pos = 1;
        while(pos < nums.length && neg < nums.length){
            if(nums[pos] < 0){
                pos=pos+2;
            }
            else if(nums[neg] > 0){
                neg=neg+2;
            }
            else if(nums[pos] > 0 && nums[neg] < 0){
                int temp = nums[pos]; 
                nums[pos] = nums[neg];
                nums[neg] = temp;
            }
        }
        return nums;
    }
}