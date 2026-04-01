class Solution {
    public int mySqrt(int x) {
        long i = 0L;
        while(i < x){
            if((i*i)<=x && (i+1)*(i+1)>x){
                break;
            }    
            else{
                i++;
            }
        }
        return (int)i;
    }
}