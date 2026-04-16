class Solution {
    public int minOperations(String s) {
        int lenZero = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                lenZero++;
            }
        }
        int lenOne = s.length() - lenZero;
        int len = Math.min(lenOne,lenZero);
        return (s.length()/2 - len);
    }
}