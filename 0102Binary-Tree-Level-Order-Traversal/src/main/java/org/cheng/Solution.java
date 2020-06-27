package org.cheng;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的层序遍历
 * 
 * @author lucheng
 *
 */
public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		levelOrder(root, 0, list);
		return list;
	}

	private void levelOrder(TreeNode node, int level, List<List<Integer>> list) {
		if (node == null) {
			return;
		}

		if (list.size() < level + 1) {
			list.add(new ArrayList<>());
		}

		list.get(level).add(node.val);

		levelOrder(node.left, level + 1, list);
		levelOrder(node.right, level + 1, list);
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
		List<List<Integer>> list = solution.levelOrder(p);
		for (List<Integer> subList : list) {
			for (Integer i : subList) {
				System.out.print(i + ",");
			}
			System.out.println();
		}

	}
}
