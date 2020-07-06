//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/542/week-4-june-22nd-june-28th/3369/

//  TreeNode is a binary tree structure.

class Day_2_CountCompleteTreeNodes {
    static int height(TreeNode node) {
        if (node == null)
            return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int ht = height(root);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int countNodes = 0;
        while (!q.isEmpty()) {
            countNodes++;
            TreeNode tmp = q.poll();
            if (tmp.left != null)
                q.offer(tmp.left);
            if (tmp.right != null)
                q.offer(tmp.right);
        }
        return countNodes;
    }
}