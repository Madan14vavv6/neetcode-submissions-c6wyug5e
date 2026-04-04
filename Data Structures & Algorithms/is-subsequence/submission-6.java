class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPnt = 0, tPnt = 0;
        while(sPnt < s.length() && tPnt < t.length()){
            if(s.charAt(sPnt) == t.charAt(tPnt)){
                sPnt++;
                //tPnt++;
            }
            tPnt++;
        }
        return sPnt == s.length();
    }
}