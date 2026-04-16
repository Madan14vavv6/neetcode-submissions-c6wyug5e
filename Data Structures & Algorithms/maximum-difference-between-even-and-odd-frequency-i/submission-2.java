class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        // count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int odd = 0;
        int even = 0;

        // check odd and even frequencies
        for (int i = 0; i < 26; i++) {
            int cnt = freq[i];
            if (cnt == 0) continue;

            if (cnt % 2 == 0) {
                even = Math.max(even, cnt);
            } else {
                odd = Math.max(odd, cnt);
            }
        }

        return odd - even;
    }
}