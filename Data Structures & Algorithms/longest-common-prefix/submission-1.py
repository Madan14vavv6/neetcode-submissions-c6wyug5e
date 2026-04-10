class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        temp = strs[0]
        for i in range(1, len(strs)):
            j = 0
            while(j < min(len(strs[i]), len(temp))):
                if temp[j] != strs[i][j]:
                    break
                j = j+1
            temp = temp[:j]
        return temp     