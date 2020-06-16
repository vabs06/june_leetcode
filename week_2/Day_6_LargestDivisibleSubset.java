//  Question Link: https://leetcode.com/explore/featured/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3359/
//  Time Complexity: O(n * n)
//  Space Complexity: O(n)

// This problem is variation of Classic LIS Problem(Dynamic Programming)

public List<Integer> largestDivisibleSubset(int[] nums) {
    int n = nums.length;
    int []lis = new int[n];
    int []pre = new int[n];
    Arrays.sort(nums);
    int max = 0, idx = -1;
    for(int i = 0; i < n; i++) {
        lis[i] = 1;
        pre[i] = -1;
        for(int j = i - 1; j >= 0; j--) {
            if(nums[i] % nums[j] == 0 && 1 + lis[j] > lis[i]) {
                lis[i] = 1 + lis[j];
                pre[i] = j;
            }
        }
        if(lis[i] > max){
            max = lis[i];
            idx = i;
        }
    }
    List<Integer> list = new ArrayList<>();
    while(idx != -1) {
        list.add(nums[idx]);
        idx = pre[idx];
    }
    return list;
}