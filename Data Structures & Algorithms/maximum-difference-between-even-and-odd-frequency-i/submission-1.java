class Solution {
    public int maxDifference(String s) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            int cnt = 0;
            for(int j = 0; j < s.length(); j++){
                if(temp == s.charAt(j)){
                    cnt++;
                }
            }
            if((cnt % 2 == 0) && (cnt > even)){
                even = cnt;
            }
            if((cnt % 2 != 0) && (cnt > odd)){
                odd = cnt;
            }
        }
        return (odd -even);
    }
}