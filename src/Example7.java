interface AA{
	void b();
	//void c();
}

interface BB{
	void d();
}

class C implements AA,BB{

	public void c() {
		System.out.println("OK-1");
	}

	public void d() {
		System.out.println("OK-111");
	}

	public void b() {
		System.out.println("OK-111121");
	}
}

public class Example7 {
	public static void main(String[] args){
		AA aa=new C();
		aa.b();
		//aa.c(); //这个是错的
		BB bb;
		bb = new C();
		bb.d();
	}
}
