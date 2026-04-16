class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = k; i > 0; i--){
            int temp = nums[0];
            for(int j = 0; j < nums.length-1; j++){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]= temp;
        }
    }
}