//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3355/
//  Time Complexity: O(n)
//  Space Complexity: O(1)

//  This solved by Two-Pointer approach.

public boolean isSubsequence(String s, String t) {
    if(s.length() == 0)
        return true;
    int sLen = s.length();
    int tLen = t.length();
    int j = 0;
    for(int i = 0; i < tLen; i++) {
        if(t.charAt(i) == s.charAt(j)){
            j++;                
        }
        if(j >= s.length())
            return true;
    }
    return false;
}