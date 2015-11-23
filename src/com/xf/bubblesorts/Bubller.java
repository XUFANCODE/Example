package com.xf.bubblesorts;

public class Bubller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 1, 2, 4, 5, 6, 88, 4, 5, 31, 2, 3, 44, 2334, 232, 12, 1243, 2, 432, 543, 32, 232, 31, 21, 4324,
				121, 3223, 3223, 423, 21, 32, 23, 4, 23, 2321, 12, 12, 12, 98, 64, 545, 756, 544, 75, 3453, 656, 322,
				642, 254, 75, 43546, 785, 3453, 454, 646, 756, 343, 8576, 856542, 538786, 545, 234 };

		// String[] b = { "啊", "包", "的", "和", "就", "图", "法" };
		// System.out.println(System.currentTimeMillis());
		// BubbleSorter bs = new BubbleSorter();
		// bs.sort(b);
		// bs.sort(a);
		// System.out.println();
		// System.out.println(System.currentTimeMillis());
		//
		// System.out.println();
		int temp = 0;
		// System.out.println(System.currentTimeMillis());
		boolean bFlag = true;
		for (int i = 0, len = a.length; i < len && bFlag; ++i) {
			bFlag = false;
			for (int j = i; j < len-1; ++j) {
				if (a[i] < a[j + 1]) { // 如果<就是确定最后一个数为最小，即从大到小。。。>就是确定最后一个最大，即从小到大。。。
					temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;
					bFlag = true;
				}
			}
		}
		// System.out.println(System.currentTimeMillis());
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
