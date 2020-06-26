package org.cheng;

/**
 * 移除重复节点
 * 空间复杂度：O(1)。
 * 
 * @author lucheng
 *
 */
public class Solution2 {
	public ListNode removeDuplicateNodes(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode node = head;
		while (node.next != null) {
			boolean b = false;
			ListNode node2 = head;
			while (node2 != node.next) {
				if (node2.val == node.next.val) {
					b = true;
					break;
				} else {
					node2 = node2.next;
				}
			}

			if (b) {
				node.next = node.next.next;
			} else {
				node = node.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(1);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode node = s.removeDuplicateNodes(node1);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}

	}
}
