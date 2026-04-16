class Solution {
    public int arrangeCoins(int n) {
        int len = 0;
        int i = 1;
        while(n >= i){
            len++;
            n -= i;
            System.out.println((n+i)+" "+n);
            i++;
        }
        return len;
        
    }
}