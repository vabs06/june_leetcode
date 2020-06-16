//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3357/
//  Time Complexity: O(n)
//  Space Complexity: O(1)

//  Two-Pointer approch problem.
//  Well known as Dutch Flag problem.



public void sortColors(int[] A) {
    int i = 0; 
    int j = A.length - 1;
    int idx = 0;
    while(idx <= j) {
        if(A[idx] == 0) {
            A[idx] = A[i];
            A[i] = 0;
            i++;
        }
        if(A[idx] == 2){
            A[idx] = A[j];
            A[j] = 2;
            j--;
            idx--;
        }
        idx++;
    }
}