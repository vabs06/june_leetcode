//  Question link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3351/
//  Time Complexity: O(log n)
//  Create a prefix array of given value and took last value to maximize the random value's upper boundary.
//  Apply general binary search to get the result.
    
    int A[];
    Random random;
    public Solution(int[] w) {
        int n = w.length;
        A = new int[n];
        random = new Random();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += w[i];
            A[i] = sum;
        }
    }
    
    public int pickIndex() {
        int l = 0;
        int r = A.length - 1;
        int res = -1;
        int randomInt =  random.nextInt(A[r]) + 1;
        while(l <= r) {
            int mid = l + (r - l) / 2; 
            if(A[mid] == randomInt)
                return mid;
            else if(A[mid] < randomInt)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }