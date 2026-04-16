class Solution {
    public int arrangeCoins(int n) {
        int len = 0;
        int i = 1;
        while(n >= 0){
            if((n - i) >= 0){
                System.out.println(n);
                len++;
                //i++;
                n = n-i;
                i++;
            }
            n--;
        }
        return len;
        
    }
}