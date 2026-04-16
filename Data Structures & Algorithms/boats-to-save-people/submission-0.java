class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int len = 0;
        int count = 0;
        for(int i = 0; i < people.length; i++){
            count += people[i];
            if(count >= limit){
                count = count -limit;
                len++;
            }
        }
        if(count > 0){
            return len+1;
        }
        return len;
    }
}