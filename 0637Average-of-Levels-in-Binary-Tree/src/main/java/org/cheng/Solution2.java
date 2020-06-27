package org.cheng;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 二叉树的层平均值
 * 
 * @author lucheng
 *
 */
public class Solution2 {

	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> list = new ArrayList<>();
		List<Integer> countList = new ArrayList<>();
		levelOrder(root, 0, list, countList);

		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)/countList.get(i));
		}
		return list;
	}

	private void levelOrder(TreeNode node, int level, List<Double> list, List<Integer> countList) {
		if (node == null) {
			return;
		}

		if (list.size() < level + 1) {
			list.add(level, (double) node.val);
			countList.add(level, 1);
		} else {
			list.set(level, list.get(level) + node.val);
			countList.set(level, countList.get(level) + 1);
		}

		levelOrder(node.left, level + 1, list, countList);
		levelOrder(node.right, level + 1, list, countList);
	}

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		TreeNode p = new TreeNode(3);

		TreeNode l2 = new TreeNode(9);
		TreeNode r2 = new TreeNode(20);

		TreeNode l2_l = new TreeNode(3);

		TreeNode l2_r = new TreeNode(15);
		TreeNode r2_l = new TreeNode(7);

		TreeNode r2_r = new TreeNode(3);
		TreeNode l3_l = new TreeNode(4);
		TreeNode r3_r = new TreeNode(4);

		p.left = l2;
		p.right = r2;
//		l2.left = l2_l;
		l2.right = l2_r;
		r2.left = r2_l;
//		r2.right = r2_r;
//		l2_l.left = l3_l;
//		r2_r.right = r3_r;
		List<Double> list = solution.averageOfLevels(p);
		for (Double i : list) {
			System.out.print(i + ",");
		}

	}
}
