interface Aaa {
	void f(String s);
}

class Bbb implements Aaa {
	@Override
	public void f(String s) {
		// TODO Auto-generated method stub
		System.out.println(s + "1");
	}
}

class Ccc implements Aaa {
	@Override
	public void f(String s) {
		// TODO Auto-generated method stub
		System.out.println(s + "2");
	}
}

class ExampleA extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7996401012281724925L;

}

class ExampleB extends ExampleA {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2527947860210473506L;

	public ExampleB(String s) {

	}
}

public class Example13 {
	public static void main(String[] args) {
		// Aaa a;
		// a = new Bbb();
		// a.f("��ʾ");
		//
		// a = new Ccc();
		// a.f("��ʾ111111111");

		// �������ϴ���ԭ��[��ʹ�ø����͵ĵط�һ����ʹ��������]
		try {
			throw new ExampleB("b");
		} catch (ExampleA e) {
			System.out.println("ExampleA");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}