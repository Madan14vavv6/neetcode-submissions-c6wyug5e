class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] temp = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == '1'){
                cnt++;
            }
        }
        cnt = cnt - 1;
        for(int i = 0; i < cnt; i++){
            temp[i] = '1';
        }
        for(int i = cnt; i < temp.length - 1; i++){
            temp[i] = '0';
        }
        temp[temp.length - 1] = '1';
        String newS = new String(temp);
        return newS;
    }
}