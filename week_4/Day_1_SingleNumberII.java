//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/542/week-4-june-22nd-june-28th/3368/

class SingleNumberII {
    public int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            one = (one ^ nums[i]) & ~two;
            two = (two ^ nums[i]) & ~one;
        }
        return one;
    }
}