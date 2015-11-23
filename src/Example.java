import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

class Father {
	double result;

	void f(Cubic cubic) {

		result = cubic.getCubic(3);

	}

	// private float z = 2;
	//
	// float f(float x, float y, float t) {
	// return x + y + t;
	// }
	//
	// float f(float x, float y) {
	// return setZ(x + y);
	// }
	//
	// public float getZ() {
	// return z;
	// }
	//
	// public float setZ(float z) {
	// this.z = z;
	// return z;
	// }
}

interface Cubic {

	double getCubic(int n);
}

class Aaaa implements Cubic {

	@Override
	public double getCubic(int n) {
		// TODO Auto-generated method stub

		return n * n * n;
	}

}

// class Son extends Father {
// float f1(float x, float y) {
// return x * y;
// }
// }

public class Example {
	public static void main(String[] args) {

		// Calendar cal = Calendar.getInstance();
		// System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		// System.out.println(new Date(Clock.systemDefaultZone().millis()));
		// SimpleDateFormat oldFormatter = new SimpleDateFormat(
		// "yyyy/MM/dd w hh:mm:ss");
		//
		// String time = oldFormatter.format(new Date(Clock.systemDefaultZone()
		// .millis()));
		//
		// System.out.println(time);

		// JAVA 8
		DateTimeFormatter dtFormater = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDate date = LocalDate.now();

		System.out.println(date.format(dtFormater));

		// Aaaa a = new Aaaa();
		//
		// double results = a.getCubic(4);
		//
		// System.out.println("results:" + results);
		//
		// Father fa = new Father();
		// fa.f(new Cubic() {
		//
		// @Override
		// public double getCubic(int n) {
		// // TODO Auto-generated method stub
		//
		// System.out.println(n * n * n);
		//
		// return n * n * n;
		// }
		//
		// });

		// System.out.print("result:" + fa.result);

		// Integer a = new Integer(129);
		// Integer b1 = 127;
		// Integer b = 127; // 将3自动装箱成Integer类型
		// int c = 129;
		// System.out.println(a + " " + b); // false 两个引用没有引用同一对象
		// System.out.println(c);

		// int[] b = new int[6];
		// System.out.println(b.length);
		String sb;
		// StringBuffer sb1;
		//
		// String a;
		// // String b;
		// sb = new String("121111115");
		// a = new String("12121");
		// // sb =;
		// System.out.println("" + a + sb);
		// String s2 = "12121";
		// String s1 = "Programming";
		// s2 = s1;
		// String s3 = "Program" + "ming";
		//
		// System.out.println("1234".intern());
		// System.out.println(s2);
		// System.out.println(s1.equals(s3));
		// System.out.println(s1 == s1.intern());

		// String b = "fasfsaf";
		// System.out.println(b.length());
		//
		// Son sum = new Son();
		//
		// float e = sum.getZ();
		// System.out.println(e);
		//
		// float c = sum.f(1, 2);// 调用Father里的f函数，俩参数的
		// System.out.println(c);
		//
		// float d = sum.f(1, 2, 3);// 调用Father里的f函数，仨参数的
		// System.out.println(d);
		//
		// float b = sum.f1(2, 3);// 调用Son里的f1函数
		// System.out.println(b);
	}
}
