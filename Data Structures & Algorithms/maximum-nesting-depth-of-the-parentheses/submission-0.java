class Solution {
    public int maxDepth(String s) {
        int depth = 0, maxxDepth = 0;
        char[] sTemp = s.toCharArray();
        for(char i : sTemp){
            if(i == '('){
                depth++;
                maxxDepth =  Math.max(maxxDepth, depth);
            }
            else if(i == ')'){
                depth--;
            }
        }
        return maxxDepth;
    }
}