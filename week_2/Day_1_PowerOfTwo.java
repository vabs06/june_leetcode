//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3354/
//  Time Complexity: O(1)
//  Space Complexity: O(1)

//  This question solved by using Bitwise operation.


public boolean isPowerOfTwo(int n) {
    return ( n > 0 && (n & (n - 1)) == 0);
}