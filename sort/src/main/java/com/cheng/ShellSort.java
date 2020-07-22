package com.cheng;

/**
 * 希尔排序
 * 
 * @author lucheng
 *
 */
public class ShellSort {
	public static Comparable<?>[] sort(Comparable<?>[] nums) {
		int j;
		Comparable<?> temp = null;
		int increment = nums.length;
		do {
			increment = increment / 3 + 1;
			System.out.println("increment=" + increment + " ");
			show(nums);
			for (int i = increment; i < nums.length; i++) {
				if (less(nums[i], nums[i - increment])) {
					temp = nums[i];
					for (j = i - increment; j >= 0 && less(temp, nums[j]); j -= increment) {
						nums[j + increment] = nums[j];
					}
					nums[j + increment] = temp;
					
					System.out.println("i=" + i + " ");
					show(nums);
				}
			}
		} while (increment > 1);
		return nums;
	}

	// 元素之间进行比较
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0; // 如果v<w则为true
	}

	// 交换元素位置
	public static void exch(Comparable<?>[] a, int i, int j) {
		Comparable<?> t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	// 单行中打印数组
	public static void show(Comparable<?> a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] nums = { 8, 1, 5, 9, 3, 7, 4, 6, 2 };
		show(sort(nums));
	}
}
