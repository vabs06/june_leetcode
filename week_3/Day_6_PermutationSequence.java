//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/541/week-3-june-15th-june-21st/3366/

class Day_6_PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++)
            fact[i] = i * fact[i - 1];
        for (int i = 1; i <= n; i++)
            list.add(i);
        k--;
        String str = "";
        for (int i = n - 1; i >= 0; i--) {
            int idx = k / fact[i];
            str += list.remove(idx);
            k = k % fact[i];
        }
        return str;
    }
}