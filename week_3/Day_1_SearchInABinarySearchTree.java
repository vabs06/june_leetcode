//  Question Link: https://leetcode.com/explore/featured/card/june-leetcoding-challenge/541/week-3-june-15th-june-21st/3361/
//  Time Complexity: O(n)
//  Space Complexity: O(1), if consider call stack then no of call.

//  Solved using simple DFS traversal.

public TreeNode searchBST(TreeNode root, int val) {
    if(root == null || root.val == val)
        return root;
    return root.val > val ? searchBST(root.left, val) 
                            : searchBST(root.right, val);
}