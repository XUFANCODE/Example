class Գ���� {
	void crySpeak(String s) {
		System.out.print(s + '\t');
	}
}

class People extends Գ���� {
	void crySpeak(String w) {
		System.out.print(w + '\t');
	}
}

public class Example5 {
	public static void main(String[] args) {
		Գ���� monkey = new People();
		monkey.crySpeak("1212131");
	}
}
