/*
 * public class ListNode {
 * 	int val;
 * 	ListNode next;
 * 	ListNode(int x) { val = x; }
 * }
 */

//	Time Complexity: O(1)
//	Space Complexity: O(1)
//	
//	This is simple operation where given "node" is pointing to the candidate node who is going to be delete from LinkeList.
//	We just simple change the position from current node  to current.next.next node. 

public void deleteNode(ListNode node) {
	node.val = node.next.val;
	node.next = node.next.next;
}
