class Solution {
    public boolean isSubsequence(String s, String t) {
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            for(int j = 0; j < t.length(); j++){
                if(t.charAt(j) != temp){
                    if(j == t.length() - 1){
                        System.out.println(temp);
                        return false;
                    }
                }
                if(t.charAt(j) == temp){
                    break;
                }
            }
        }
        if(t.length()==0)
            return false;
        else
            return true;
    }
}