class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int canPlace = 0;
        if(len % 2 != 0 && flowerbed[0] == 1){
            canPlace = (len/2)+1;
        }
        else{
            canPlace = len/2;
        }
        int alreadyPlace = 0;
        for(int i = 0; i < n; i++){
            if(flowerbed[i]==1){
                alreadyPlace++;
            }
        }
        System.out.println(canPlace - alreadyplace);
        if(((canPlace - alreadyPlace)-n) >= 0){
            return true;
        }
        else{
            return false;
        }
    }
}