package com.cheng;

/**
 * 归并排序
 *
 * @author lucheng
 */
public class MergeSort2 {
    private static Comparable[] aux;//归并所需的辅助数组

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);//将左半边排序
        sort(a, mid + 1, hi);//将右半边排序
        merge(a, lo, mid, hi);//归并结果
    }

    public static Comparable<?>[] merge(Comparable<?>[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
        return a;
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
        Integer[] nums = {8, 1, 5, 9, 3, 7, 4, 6, 2};
        sort(nums);
        show(nums);
    }
}
