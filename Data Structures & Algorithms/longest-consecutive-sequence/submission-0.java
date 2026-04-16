class Solution {
    public int longestConsecutive(int[] nums) {

       Arrays.sort(nums);
       int maxLen = 0, i = 1, index = 1, temp =  nums[0], len = 1;
       while(i < nums.length){
        System.out.println((temp+index) + " "+ nums[i]);
        if((temp+index) == nums[i]){
            i++;
            len++;
            index++;
            if(len > maxLen){
                maxLen = len;
            }
        }
        else if(nums[i-1] == nums[i]){
            i++;
        }
        else{
            temp = nums[i];
            index = 1;
            if(len > maxLen){
                maxLen = len;
            }
            len = 0;
            i++;
        }
       }
       return maxLen;
    }
}
