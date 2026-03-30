class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= numRows - 1; i++ ){
            int val = 1;
            List<Integer> ansTemp = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                ansTemp.add(val);
                val = val * (i - j) / (j + 1);
            }
            System.out.println(ansTemp);
            ans.add(ansTemp);
            
        }
        return ans;
    }
}