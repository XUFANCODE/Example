public class Sale {
	public static void main(String[] args) {
		MutliThread m1, m2, m3;
		m1 = new MutliThread("Window 1");
		m2 = new MutliThread("Window 2");
		m3 = new MutliThread("Window 3");
		m1.start();
		m2.start();
		m3.start();
	}
}

class MutliThread extends Thread {
	private int ticket = 100;// ÿ���̶߳�ӵ��100��Ʊ

	
	MutliThread(String s) {
		setName(s);// ���ø���������Ĺ��췽��  super(s)һ��
	}
	
	public void run() {
		while (ticket > 0) {
			System.out.println(ticket-- + " is saled by "
					+ Thread.currentThread().getName());
		}
	}
}