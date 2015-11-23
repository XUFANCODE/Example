package com.xf.enumeration;

public class Demo4<T, V> {
	private T name;
	private V age;

	/*
	 * 泛型构造函数
	 */
	private Demo4(T name, V age) {
		this.name = name;
		this.age = age;
	}

	public T getName() {
		return name;
	}

	public V getAge() {
		return age;
	}

	public static void main(String[] args) {
		Demo4<String, Integer> dm4 = new Demo4<String, Integer>("许凡", 25);
		System.out.println(dm4.getName() + " " + dm4.getAge());
	}
}
