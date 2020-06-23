package org.cheng;
/**
 * 两数相加
 * @author lucheng
 *
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode node = null, currentNode = null;
		int ca = 0;
		for (ListNode t1 = l1, t2 = l2; t1 != null || t2 != null;) {
			int sum = ca;
			sum += t1 != null ? t1.val : 0;
			sum += t2 != null ? t2.val : 0;
			ListNode temp = new ListNode(sum % 10);
			if (node == null) {
				node = currentNode = temp;
			} else {
				currentNode.next = temp;
				currentNode = currentNode.next;
			}
			ca = sum / 10;

			if (t1 != null) {
				t1 = t1.next;
			}
			if (t2 != null) {
				t2 = t2.next;
			}
		}
		if (ca == 1) {
			currentNode.next = new ListNode(ca);
		}
		return node;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);

		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;

		node4.next = node5;
		node5.next = node6;

		ListNode node = s.addTwoNumbers(node1, node4);
		System.out.println(node);
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
