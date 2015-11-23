package com.xf.enumeration;

/**
 * @author Rollen-Holt  π”√∑∫–Õ
 */

public class Demo3<T, V> {
	Demo3() {
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public V getAge() {
		return age;
	}

	public void setAge(V age) {
		this.age = age;
	}

	private T name;
	private V age;

	public static void main(String[] args) {
		Demo3<String, Integer> he = new Demo3<String, Integer>();
		he.setAge(10);
		he.setName("Rollen Holt");
		System.out.println(he.getName() + "   " + he.getAge());
	}
}
