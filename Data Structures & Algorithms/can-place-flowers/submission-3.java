class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int canPlace = 0;
        if(len >1){
            if(len % 2 != 0 && (flowerbed[0] == 1 || flowerbed[1] == 0)){
                canPlace = (len/2)+1;
            }
            else{
                canPlace = len/2;
            }
        } 
        else{
            if(flowerbed[0] == 0){
                canPlace = 1;
            }
            else{
                canPlace = 0;
            }    
        }       
        int alreadyPlace = 0;
        for(int i = 0; i < len; i++){
            if(flowerbed[i]==1){
                alreadyPlace++;
            }
        }
        
        System.out.println(canPlace+" "+alreadyPlace+" "+(canPlace - alreadyPlace));
        if(((canPlace - alreadyPlace)-n) >= 0){
            return true;
        }
        else{
            return false;
        }
    }
}