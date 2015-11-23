public class Sale1 {
	public static void main(String[] args) {
		MutliThread1 m = new MutliThread1();
		m.setTicket(100);
		m.m1.start();
		m.m2.start();
		m.m3.start();
	}
}

class MutliThread1 implements Runnable {
	private int ticket = 0;// 每个线程都拥有100张票
	Thread m2, m1, m3;

	MutliThread1() {
		m1 = new Thread(this);
		m1.setName("1");
		m2 = new Thread(this);
		m2.setName("2");
		m3 = new Thread(this);
		m3.setName("3");
	}

	public void setTicket(int n) {
		ticket = n;
	}

	public void run() {
		while (ticket > 0) {
			System.out.println(ticket-- + " is saled by "
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
