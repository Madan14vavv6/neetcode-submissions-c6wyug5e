class Solution {
    public int uniquePaths(int m, int n) {
        return defUnique(0, 0, m, n);
    }
    private int defUnique(int i, int j, int m, int n){
        if(i == (m-1) && j == (n-1)) return 1;
        if(i >= m || j >= n) return 0;
        return defUnique(i, j+1, m, n) + defUnique(i+1, j, m, n);
    }
}
