class Solution {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] != val){
                len++;
            }
        }
        System.out.println(len);
        int[] arr = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != val){
                arr[j] = nums[i];
                j++;
            }
        }
        
        for(int k = j; k < n; k++){
            arr[k] = val;
            //j++;
        }
        for(int i : arr){
            System.out.print(i);
        }
        for(int i = 0; i < n; i++){
            nums[i] = arr[i];
        }
        return len;
    }
}