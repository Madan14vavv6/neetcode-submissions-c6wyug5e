class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int temp = nums1[i];
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == temp){
                    if(j+1 != nums2.length){
                        if(nums2[j+1] > nums2[j] && j+1 < nums2.length) 
                            ans[i] = nums2[j+1];
                        else 
                            ans[i] = -1;
                    }
                    else 
                        ans[i] = -1;
                } 
            }
        }
        return ans;
    }
  
}
