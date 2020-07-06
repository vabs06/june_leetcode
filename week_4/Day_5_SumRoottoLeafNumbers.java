//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/542/week-4-june-22nd-june-28th/3372/

class Day_5_SumRoottoLeafNumbers {
    private static int helper(TreeNode root, int parent) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return root.val + 10 * parent;
        int left = helper(root.left, parent * 10 + root.val);
        int right = helper(root.right, parent * 10 + root.val);
        return left + right;
    }

    public int sumNumbers(TreeNode root) {
        int parent = 0;
        return parent = helper(root, parent);

    }
}