import java.lang.reflect.*;

class Rest {
	double width, height, area;

	public double getArea() {
		area = height * width;
		return area;
	}
}

// ���� ����

public class Example2 {
	public static void main(String[] args) {
		Rest c = new Rest();
		Class<? extends Rest> cc = c.getClass();

		String ccc = cc.getName();

		@SuppressWarnings("rawtypes")
		Constructor[] cccc = cc.getDeclaredConstructors();
		Field[] field = cc.getDeclaredFields();
		Method[] method = cc.getDeclaredMethods();

		// ��Ҫ�����ڷ�������ֶ�
		for (int i = 0; i < field.length; i++)
			System.out.println(field[i].toString());

		for (int i = 0; i < method.length; i++)
			System.out.println(method[i].toString());

		for (int i = 0; i < cccc.length; i++)
			System.out.println(cccc[i].toString());
	}
}
