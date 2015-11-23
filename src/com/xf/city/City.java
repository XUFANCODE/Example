package com.xf.city;

class Country {
	String name = "ddfdds";

	String value(String name) {
		name = "china";
		return name;
	}
}

public class City extends Country {
	String name = "dfssfds";

	String value(String name) {
		super.value("a");
		System.out.println(name);
		System.out.println(super.value("a"));
		return name;
	}

	public static void main(String[] args) {
		City ct = new City();
		ct.value("fds");
	}

}
