// Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3356/
// Time Complexity: O(log n)
// Space Complexity: O(1)

// Simple binary search which will return the position or lower bound.

public int searchInsert(int[] nums, int target) {
    int res = 0;
    if(nums.length == 0 || target == 0)
        return res;
    int l = 0;
    int h = nums.length - 1;
    int mid;
    while(l <= h) {
        mid = l + (h - l) / 2;
        
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target) {
            h = mid - 1;
            res= mid;
        } 
        else {
            l = mid + 1;
            res= mid + 1;
        }
    }
    return res;
}