public class Example1 {// ÄÚ²¿Àà
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;

				TrackingSlip(String s) {
					id = s;
				}

				String getSlip() {
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			System.out.print(s);
		}
	}

	public void track() {
		internalTracking(true);
	}

	public static void main(String[] args) {
		Example1 p = new Example1();
		p.track();
		
		System.out.println((char)29233);
	}

	// public int ack(int m, int n) {
	// if (m == 0)
	// return n + 1;
	// else if (n == 0)
	// return ack(m - 1, 1);
	// else
	// return ack(m - 1, ack(m, n - 1));
	//
	// }

}
