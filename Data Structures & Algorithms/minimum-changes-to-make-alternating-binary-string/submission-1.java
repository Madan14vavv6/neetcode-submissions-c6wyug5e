class Solution {
    public int minOperations(String s) {
        int len = 0;
        int i = 1;
        while(i < s.length()){
            char temp = s.charAt(i-1);
            if(temp != s.charAt(i)){
                i++;
            }
            else{
                len++;
                i=i+2;
            }
        }
        return len;
    }
}