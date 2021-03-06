package org.cheng;

/**
 * 二叉树的最大深度
 * 
 * @author lucheng
 *
 */
public class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return getHigh(root);
	}

	private int getHigh(TreeNode node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(getHigh(node.left), getHigh(node.right));
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode p = new TreeNode(1);

		TreeNode l2 = new TreeNode(2);
		TreeNode r2 = new TreeNode(2);

		TreeNode l2_l = new TreeNode(3);

		TreeNode l2_r = new TreeNode(3);
		TreeNode r2_l = new TreeNode(3);

		TreeNode r2_r = new TreeNode(3);

		TreeNode l3_l = new TreeNode(4);
		TreeNode r3_r = new TreeNode(4);

		p.left = l2;
		p.right = r2;
		l2.left = l2_l;
//		l2.right = l2_r;
//		r2.left = r2_l;
		r2.right = r2_r;
		l2_l.left = l3_l;
		r2_r.right = r3_r;

		System.out.println(solution.maxDepth(p));
	}
}
