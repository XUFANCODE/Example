public class Example15 {

	public Destination dest(String s) {
		class PDestination implements Destination {
			private String lable;

			private PDestination(String whereTo) {
				lable = whereTo;
			}

			public String readLable() {
				return lable;
			}
		}
		return new PDestination(s);
	}

	public static void main(String[] args) {

		Example15 e = new Example15();
		Destination d = e.dest("tanzania");
	}
}
