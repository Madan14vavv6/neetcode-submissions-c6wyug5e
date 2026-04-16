class Solution {
    public boolean makeEqual(String[] words) {
        int[] hash = new int[26];
        for(int i = 0; i < words.length; i++){
            String temp = words[i];
            for(int j = 0; j < temp.length(); j++){
                char t = temp.charAt(j);
                int index = t - 'a';
                //System.out.println(index);
                hash[index]++;
            }
        }
        for(int i : hash){
            System.out.println(i);
        }
        for(int i = 1; i < hash.length; i++){
            if(hash[i] != hash[i - 1] && hash[i] != 0){
                return false;
            }
        }
        return true;
    }
}