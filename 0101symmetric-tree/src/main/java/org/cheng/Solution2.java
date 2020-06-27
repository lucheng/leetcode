package org.cheng;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 相同的树
 * 
 * @author lucheng
 *
 */
public class Solution2 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root.left);
		queue.offer(root.right);
		TreeNode l = null;
		TreeNode r = null;
		while (!queue.isEmpty()) {
			r = queue.poll();
			l = queue.poll();
			if (r == null && l == null) {
				continue;
			}
			
			if ((l == null && r != null) || (l != null && r == null) || l.val != r.val) {
				return false;
			}
			queue.offer(r.left);
			queue.offer(l.right);
			queue.offer(r.right);
			queue.offer(l.left);
		}
		return true;
	}

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		TreeNode p = new TreeNode(9);
		TreeNode l2 = new TreeNode(25);
		TreeNode r2 = new TreeNode(25);
//		TreeNode l2_l = new TreeNode(3);
		TreeNode l2_r = new TreeNode(-95);
		TreeNode r2_l = new TreeNode(-95);
		TreeNode r2_r = new TreeNode(3);

		TreeNode l3_l = new TreeNode(-100);
//		TreeNode l3_r = new TreeNode(3);
//		TreeNode r3_l = new TreeNode(-95);
		TreeNode r3_r = new TreeNode(-100);

		p.left = l2;
		p.right = r2;
//		l2.left = l2_l;
		l2.right = l2_r;
		r2.left = r2_l;
//		r2.right = r2_r;
		l2_r.left = l3_l;
		r2_l.right = r3_r;
		System.out.println(solution.isSymmetric(p));
	}
}
