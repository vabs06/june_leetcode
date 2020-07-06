//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/542/week-4-june-22nd-june-28th/3371/

class Day_4_FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int sl = 0;
        int fs = 0;
        do {
            sl = nums[sl];
            fs = nums[nums[fs]];
        } while (sl != fs);
        fs = 0;

        while (sl != fs) {
            sl = nums[sl];
            fs = nums[fs];
        }
        return sl;

    }
}