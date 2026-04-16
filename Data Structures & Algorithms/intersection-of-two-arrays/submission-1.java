class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      int[] hash = new int[1000];
      for(int i = 0; i < nums1.length; i++){
        if(hash[nums1[i]] == 0){
            hash[nums1[i]]++;
        }    
      }  
      for(int i = 0; i < nums2.length; i++){
        if(hash[nums2[i]] == 1){
            hash[nums2[i]]++;
        }    
      } 
      int len =0;
      for(int i = 0; i < hash.length; i++){
        if(hash[i] > 1){
            len++;
        }
      } 
      int[] ans = new int[len];
      int index =0;
      for(int i = 0; i < hash.length; i++){
        if(hash[i] > 1){
            ans[index]=i;
            index++;
        }
      }
      return ans;
    }
}