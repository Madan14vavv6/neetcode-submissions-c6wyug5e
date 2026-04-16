class Solution {
    public boolean validPalindrome(String s) {
        int left  = 0, rigth = s.length()-1, cnt = 0;
        while(left <= rigth){
            if(s.charAt(left) == s.charAt(rigth)){
                left++;
                rigth--;
            }
            else if(s.charAt(left) != s.charAt(rigth) && cnt < 2){
                left++;
                rigth--;
                cnt++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}