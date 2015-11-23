package com.xf.enumeration;

/**
 * @author Rollen-Holt 泛型类的构造方法定义
 */
public class Demo2<T, V> {

	Demo2(T name, V age) {
		this.age = age;
		this.name = name;
	}

	public T getName() {
		return name;
	}

	public V getAge() {
		return age;
	}

	private T name;
	private V age;

	public static void main(String[] args) {
		Demo2<String, Integer> he = new Demo2<String, Integer>("Rollen", 12);
		System.out.println(he.getName() + "  " + he.getAge());
	}
}