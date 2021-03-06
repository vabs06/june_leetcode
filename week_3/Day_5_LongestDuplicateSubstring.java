//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/541/week-3-june-15th-june-21st/3365/

class Day_5_LongestDuplicateSubstring {
    long mod = 0;

    public String longestDupSubstring(String S) {
        mod = (long) 1 << 32;
        int n = S.length();

        int left = 1, right = n;
        char[] nums = S.toCharArray();

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (search(mid, n, nums) != -1)
                left = mid + 1;
            else
                right = mid - 1;
        }

        int start = search(left - 1, n, nums);
        return S.substring(start, start + left - 1);
    }

    int search(int l, int n, char[] nums) {

        long h = 0;
        for (int i = 0; i < l; i++) {
            h = (h * 26 + (nums[i] - 'a')) % mod;
        }

        Set<Long> set = new HashSet<>();
        set.add(h);
        long aL = 1;
        for (int i = 1; i <= l; ++i)
            aL = (aL * 26) % mod;

        for (int i = 1; i < n - l + 1; i++) {
            h = (long) (h * 26 - (nums[i - 1] - 'a') * aL % mod + mod) % mod;
            h = (h + (nums[i + l - 1] - 'a')) % mod;
            if (set.contains(h))
                return i;
            set.add(h);
        }

        return -1;
    }
}