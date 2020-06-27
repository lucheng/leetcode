package org.cheng;

/**
 * 相同的树
 * 
 * @author lucheng
 *
 */
public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if ((p == null && q != null) || (p != null && q == null) || p.val != q.val) {
			return false;
		}
		return isSymmetric(p.left, q.right) ? isSymmetric(p.right, q.left) : false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode p = new TreeNode(1);
		TreeNode l2 = new TreeNode(2);
		TreeNode r2 = new TreeNode(2);
		TreeNode l2_l = new TreeNode(3);
		TreeNode l2_r = new TreeNode(4);
		TreeNode r2_l = new TreeNode(4);
		TreeNode r2_r = new TreeNode(3);
		p.left = l2;
		p.right = r2;
		l2.left = l2_l;
		l2.right = l2_r;
		r2.left = r2_l;
		r2.right = r2_r;
		System.out.println(solution.isSymmetric(p));
	}
}
