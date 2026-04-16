class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= numRows - 1; i++ ){
            List<Integer> ansTemp = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                int n = factorial(i)/(factorial(i - j) * factorial(j));
                ansTemp.add(n);
            }
            System.out.println(ans);
            ans.add(ansTemp);
            
        }
        return ans;
    }
    public int factorial(int i){
        if(i == 0){
            return 1;
        }
        else{
            return i*factorial(i - 1);
        }
    }
}