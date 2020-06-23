package org.cheng;

/**
 * 合并两个有序链表
 * 
 * @author lucheng
 *
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode temp = new ListNode(-1);
		ListNode current = temp;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		if (l1 == null) {
			current.next = l2;
			return temp.next;
		}
		
		if (l2 == null) {
			current.next = l1;
			return temp.next;
		}
		return temp.next;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(4);

		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;

		node4.next = node5;
		node5.next = node6;

		ListNode node = s.mergeTwoLists(node1, node4);
		while (node != null) {
			System.out.print(node.val);
			node = node.next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
