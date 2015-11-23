package com.xf.enumeration;

import org.junit.Test;

public class Demo1 {

	@Test
	public void test() {
		print(Grade.B);
	}

	public void print(Grade g) {
		System.out.println(g.getValue());
	}

	enum Grade {
		A("100-80"), B("80-60"), C("60-0");

		private String value;

		private Grade(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

	}
}
