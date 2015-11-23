package com.xf.quicksort;

public class QuickSorter {

	public QuickSorter(int[] a) {
		quick(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	//
	public int getMilddle(int[] list, int low, int high) {
		int tmp = list[low];
		while (low < high) {
			while (low < high && list[high] >= tmp) {
				high--;
			}
			System.out.println(high);
			list[low] = list[high];
			while (low < high && list[low] <= tmp) {
				low++;
			}
			System.out.println(low);
			list[high] = list[low];
		}
		list[low] = tmp;
		return low;
	}

	public void _quickSort(int[] list, int low, int high) {
		if (low < high) {
			int middle = getMilddle(list, low, high);
			_quickSort(list, low, middle - 1);
			_quickSort(list, middle + 1, high);
		}
	}

	private void quick(int[] a2) {
		if (a2.length > 0) {
			_quickSort(a2, 0, a2.length - 1);
		}
	}

	public static void main(String[] args) {
		// int[] a = { 1, 2, 4, 5, 6, 88, 4, 5, 31, 2, 3, 44, 2334, 232, 12,
		// 1243, 2, 432, 543, 32, 232, 31, 21, 4324, 121,
		// 3223, 3223, 423, 21, 32, 23, 4, 23, 2321, 12, 12, 12, 98, 64, 545,
		// 756, 544, 75, 3453, 656, 322, 642,
		// 254, 75, 43546, 785, 3453, 454, 646, 756, 343, 8576, 856542, 538786,
		// 545, 234 };
		int a[] = { 5,4,9,4,3 };
		new QuickSorter(a);
	}
}
