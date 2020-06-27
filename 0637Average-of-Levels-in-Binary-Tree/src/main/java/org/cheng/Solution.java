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
public class Solution {

	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> list = new ArrayList<>();
		Map<Integer, Double[]> map = new LinkedHashMap<>();
		levelOrder(root, 0, map);

		for (Double[] i : map.values()) {
			list.add(i[0] / i[1]);
		}
		return list;
	}

	private void levelOrder(TreeNode node, int level, Map<Integer, Double[]> map) {
		if (node == null) {
			return;
		}

		if (map.get(level) == null) {
			map.put(level, new Double[] { 0.0, 0.0 });
		}

		map.get(level)[0] = map.get(level)[0] + node.val;
		map.get(level)[1] = map.get(level)[1] + 1;

		levelOrder(node.left, level + 1, map);
		levelOrder(node.right, level + 1, map);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
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
