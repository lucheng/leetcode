package org.cheng;

/**
 * 相同的树
 * 
 * @author lucheng
 *
 */
public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if ((p == null && q != null) || (p != null && q == null) || p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) ? isSameTree(p.right, q.right) : false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode p = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		p.left = p2;
		p.right = p3;

		TreeNode q = new TreeNode(1);
		TreeNode q2 = new TreeNode(2);
		TreeNode q3 = new TreeNode(3);
		q.left = q2;
		q.right = q3;
		System.out.println(solution.isSameTree(p, q));
	}
}
