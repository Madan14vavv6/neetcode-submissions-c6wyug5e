class Solution {
    public int rob(int[] nums) {
        int max = 0;
        int sum0 = 0, sum1 = 0, i = 0, j = 1;
        while(i < nums.length){
            sum0 += nums[i];
            i = i+2;
        } 
        while(j < nums.length){
            sum1 += nums[j];
            j = j+2;
        }
        //System.out.println(sum0 + " " +sum1);
        max = Math.max(sum0,sum1);
        return max;
    }
}
