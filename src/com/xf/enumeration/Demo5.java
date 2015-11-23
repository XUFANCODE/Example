package com.xf.enumeration;

 class Info<T> {

	private T name;

	Info(T name) {
		this.name = name;
	}

	public T getName() {
		return name;
	}
	
	public String toString(){ // ֱ�Ӵ�ӡ  
		  return this.name.toString() ;  
		 } 
}

public class Demo5 {
	public static void function(Info<?> temp) {
		System.out.println("���ݣ� " + temp);
	}

	public static void main(String[] args) {
		Info<String> demo = new Info<String>("Rollen");
		function(demo);
	}
}
