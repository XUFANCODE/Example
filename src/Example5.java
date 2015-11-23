class 猿人类 {
	void crySpeak(String s) {
		System.out.print(s + '\t');
	}
}

class People extends 猿人类 {
	void crySpeak(String w) {
		System.out.print(w + '\t');
	}
}

public class Example5 {
	public static void main(String[] args) {
		猿人类 monkey = new People();
		monkey.crySpeak("1212131");
	}
}
