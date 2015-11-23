package datastucture;

/**
 * 
 * @author XFTHX ������
 */
class Gen2 {
	private Object ob; // ����һ��ͨ�����ͳ�Ա

	public Gen2(Object ob) {
		this.ob = ob;
	}

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

	public void showTyep() {
		System.out.println("T��ʵ��������: " + ob.getClass().getName());

	}
}

class Gen1<T> { // �ؼ�������,����Ҫ��Gen1<T>,���ӻᱨ��
	private T ob; // ���巺�ͳ�Ա����

	public Gen1(T ob) {
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public void showTyep() {
		System.out.println("T��ʵ��������: " + ob.getClass().getName());
	}
}

public class GetDemo {

	public static void main(String[] args) {
		// ������Gen1��һ��Integer�汾
		Gen1<Integer> intOb1;
		intOb1 = new Gen1<Integer>(88);
		intOb1.showTyep();
		int i1 = intOb1.getOb();
		System.out.println("value= " + i1);

		// ������Gen2��һ��Integer�汾
		Gen2 intOb = new Gen2(new Integer(88));
		intOb.showTyep();
		int i = (Integer) intOb.getOb();
		System.out.println("value= " + i);

		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");

		// ���巺����Gen1��һ��String�汾
		Gen1<String> strOb1;
		strOb1 = new Gen1<String>("Hello Gen!");
		strOb1.showTyep();
		String s1 = strOb1.getOb();
		System.out.println("value= " + s1);

		// ������Gen2��һ��String�汾
		Gen2 strOb = new Gen2("Hello Gen!");
		strOb.showTyep();
		String s = (String) strOb.getOb();
		System.out.println("value= " + s);

		System.exit(0);
	}
}