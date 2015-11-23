class Tixing {
	float shangdi, gao;
	static float xiadi;// 对象共享变量

	Tixing() {
	};

	Tixing(float x, float y, float z) {
		shangdi = x;
		xiadi = y;
		gao = z;
	}

	float huoqu() {
		return xiadi;
	}

	void xiugai(float d) {
		xiadi = d;
	}
}

public class Example4 {
	public static void main(String[] args) {
		Tixing laderOne = new Tixing(3.0f, 10.0f, 20), laderTwo = new Tixing(
				2.0f, 3.0f, 10);
		// System.out.println("" + laderOne.huoqu());
		Tixing.xiadi = 200;
		// System.out.println("" + laderOne.huoqu());

		laderTwo.xiugai(60);
		// System.out.println("" + laderTwo.huoqu());
		// System.out.println("" + laderTwo.huoqu());
	}
}
