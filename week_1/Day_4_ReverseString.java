//	Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3350/
//	This is simple Two-Pointer Approach.
//	Time Complexity: n/2 because we're traversing only array i.e. O(n)
//	Space Complexity: O(1)
public void reverseString(char[] s) {
	int i = 0;
	int j = s.length - 1;
	while(i < j) {
		char ch = s[i];
		s[i] = s[j];
		s[j] = ch;
		i++;
		j--;
	}				        
}
