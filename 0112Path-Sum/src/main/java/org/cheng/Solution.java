package org.cheng;

/**
 * 二叉树的最小深度
 * 
 * @author lucheng
 *
 */
public class Solution {

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {
			return sum == root.val;
		}
		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode p = new TreeNode(5);

		TreeNode l2 = new TreeNode(4);
		TreeNode r2 = new TreeNode(8);

		TreeNode l2_l = new TreeNode(11);

		TreeNode r2_l = new TreeNode(13);
		TreeNode r2_r = new TreeNode(4);

		TreeNode l3_l = new TreeNode(7);
		TreeNode l3_r = new TreeNode(2);

		p.left = l2;
		p.right = r2;
		l2.left = l2_l;
		r2.left = r2_l;
		r2.right = r2_r;
		l2_l.left = l3_l;
		l2_l.right = l3_r;

		System.out.println(solution.hasPathSum(p, 22));
	}
}
