class Solution {
    public boolean lemonadeChange(int[] bills) {
        int money = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] > 5) money = money + 5 - bills[i];
            if(money < 0) return false;
            money += bills[i];
        }
        return true;
    }
}