class A {
	int x;

	void setX(int y) {
		this.x = y;
	}

	int getX() {
		return x;
	}

	public A() {
	};
}

class B extends A {

	String a = "1312";
	String tem = "0000";
	public B(String s) {
		
		
		tem =s;

	}

	public void f(A a) {
		a.setX(100);
	}
}

public class Example6 {
	public static void main(String[] args) {

		A a = new A();
		a.setX(8);
		System.out.println(a.getX());
		B b = new B("1213");
		b.f(a);
		System.out.print(b.tem);
	}
}
