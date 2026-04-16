class Solution {
    public String convertToTitle(int columnNumber) {
        int columnNumberTemp = columnNumber;
        StringBuffer s = new StringBuffer();
        int len = 0;
        while(columnNumberTemp >= 26){
            len++;
            System.out.println(columnNumberTemp);
            columnNumberTemp = columnNumberTemp - 26;
            System.out.println(columnNumberTemp);
        }
        if(len > 0){
            s.append((char)(len + (int)'A' - 1));
        }
        System.out.println(columnNumber + " " + len + " " +columnNumberTemp);
        s.append((char)(columnNumberTemp + (int)'A' - 1));
        String ans = s.toString();
        return ans;
    }
}