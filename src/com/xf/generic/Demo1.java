package com.xf.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(4);
		list.add(5);
		// for (Object str : list) {
		// String s = (String) str;
		// // Integer i = (Integer) list.get(0);+ " " + i
		// System.out.println(s);
		// }
		for (Object str : list) {
			Integer s = (Integer) str;
			// Integer i = (Integer) list.get(0);+ " " + i
			System.out.println(s);
		}
	}

}
