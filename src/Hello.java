public class Hello {

	String str = new String("wokao");

	public static void main(String[] args) {
		ABCD ab = new ABCD("Hello");
		// ab.cd = "Hello";
		String str = new String("wokao");
		test(ab, str);
		System.out.println("ab.cd = " + ab.cd);
		System.out.println("str = " + str);
	}

	private static void test(ABCD ab, String str) {
		ab.cd = "Good";
		str = "World";
	}
}

class ABCD {
	ABCD(String s) {
		cd = s;
	}

	public String cd;
}