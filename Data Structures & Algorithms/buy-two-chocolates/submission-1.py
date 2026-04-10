class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        prices.sort()
        buyTwo = 0
        for i in range(0,2):
            buyTwo = buyTwo + prices[i]
        if money >= buyTwo:
            return money - buyTwo
        return money