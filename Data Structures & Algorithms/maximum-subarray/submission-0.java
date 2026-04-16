class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int s = 0;
            for(int j = i; j < nums.length; j++){
                s += nums[j];
                System.out.println(s + " " + sum);
                sum = Math.max(sum,s);
            }
        }
        return sum;
    }
}
