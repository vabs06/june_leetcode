// Question link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3347/



// Tree Node Structure

/*
class TreeNode {
	int data;
	TreeNode left, right;
	TreeNode(int data){
	  this.data = data;
  	  left = right = null;
	}
*/
	// Recursive Solution
	// Time Complexity: O(n), n is no of nodes.
	// Space Complexity: O(n)
	public static TreeNode invertTree(TreeNode root) {
		if(root == null)
			return root;
		TreeNode leftNode = invertTree(root.left);
		TreeNode rightNode = invertTree(root.right);

		root.right = leftNode;
		root.left = rightNode;
		return root;
	}

	//	Iterative Solution
	//	Time Complexity: O(n)
	//	Space Complexity: O(n)
	public static TreeNode invertTreeIterative(TreeNode root) {
		if(root == null)
			return root;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			TreeNode cur = q.poll();
			TreeNode tmp = cur.left;
			cur.left = cur.right;
			cur.right = tmp;
			if(cur.left != null) 
				q.offer(cur.left);
			if(cur.right != null)
				q.offer(cur.right);
		}
		return root;
	}
