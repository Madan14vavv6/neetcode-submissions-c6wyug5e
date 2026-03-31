class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int rigth = 1;
        while(rigth < nums.length){
            if(nums[left] != 0){
                left++;
                rigth++;
            }
            else if(nums[left] == 0 && nums[rigth] != 0){
                int temp = nums[left];
                nums[left] = nums[rigth];
                nums[rigth] = temp;
            }
            else{
                rigth++;
            }
        }
    }
}