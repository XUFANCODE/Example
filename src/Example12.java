//import java.io.*;
//
//public class Example12 {
//	public static void main(String[] arg){
//		MyInterface a =new DecoratorA(new DecoratorB(new MyClass());
//		a.print();
//	}
//}
//
//class DecoratorA implements Decorator {
//	MyInterface myObject;
//
//	DecoratorA(myInterface myObject) {
//		this.myObject = myObject;
//	}
//
//	public void print() {
//		myObject.print();
//		System.out.print("world!");
//	}
//}
//
//class DecoratorB implements Decorator {
//	MyInterface myObject;
//
//	DecoratorA(myInterface myObject) {
//		this.myObject = myObject;
//	}
//
//	public void print() {
//		System.out.print("my");
//		myObject.print();
//	}
//}
