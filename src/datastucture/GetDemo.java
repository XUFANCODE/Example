package datastucture;

/**
 * 
 * @author XFTHX 泛型类
 */
class Gen2 {
	private Object ob; // 定义一个通用类型成员

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
		System.out.println("T的实际类型是: " + ob.getClass().getName());

	}
}

class Gen1<T> { // 关键在这里,还是要加Gen1<T>,不加会报错
	private T ob; // 定义泛型成员变量

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
		System.out.println("T的实际类型是: " + ob.getClass().getName());
	}
}

public class GetDemo {

	public static void main(String[] args) {
		// 定义类Gen1的一个Integer版本
		Gen1<Integer> intOb1;
		intOb1 = new Gen1<Integer>(88);
		intOb1.showTyep();
		int i1 = intOb1.getOb();
		System.out.println("value= " + i1);

		// 定义类Gen2的一个Integer版本
		Gen2 intOb = new Gen2(new Integer(88));
		intOb.showTyep();
		int i = (Integer) intOb.getOb();
		System.out.println("value= " + i);

		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");

		// 定义泛型类Gen1的一个String版本
		Gen1<String> strOb1;
		strOb1 = new Gen1<String>("Hello Gen!");
		strOb1.showTyep();
		String s1 = strOb1.getOb();
		System.out.println("value= " + s1);

		// 定义类Gen2的一个String版本
		Gen2 strOb = new Gen2("Hello Gen!");
		strOb.showTyep();
		String s = (String) strOb.getOb();
		System.out.println("value= " + s);

		System.exit(0);
	}
}