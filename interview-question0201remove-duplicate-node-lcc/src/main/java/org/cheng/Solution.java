package org.cheng;

import java.util.HashSet;
import java.util.Set;

/**
 * 移除重复节点
 * 
 * @author lucheng
 *
 */
public class Solution {
	public ListNode removeDuplicateNodes(ListNode head) {
		if (head == null) {
			return head;
		}
		Set<Integer> set = new HashSet<>();
		set.add(head.val);
		ListNode node = head;
		while (node.next != null) {
			if (set.add(node.next.val)) {
				node = node.next;
			} else {
				node.next = node.next.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode node1 = new ListNode(1);
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

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
