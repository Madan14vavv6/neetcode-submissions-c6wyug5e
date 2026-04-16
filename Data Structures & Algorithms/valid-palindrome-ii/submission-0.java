class Solution {
    public boolean validPalindrome(String s) {
        int left  = 0;
        int rigth = s.length()-1;
        int cnt = 0;
        while(left <= rigth){
            if(s.charAt(left) != s.charAt(rigth)){
                cnt++;
                left++;
                rigth--;
                if(cnt >= 2){
                    return false;
                }
            }
            else{
                left++;
                rigth--;
            }
        }
        return true;
    }
}