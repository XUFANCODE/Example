public class Example10 {
	public static void main(String[] args) {
		People1 teacher, student;
		ComputerSum sum = new ComputerSum();
		teacher = new People1("老师", 200, sum);
		student = new People1("学生", 200, sum);
		teacher.start();
		student.start();
	}
}

class ComputerSum {
	int sum;

	public void setSum(int n) {
		sum = n;
	}

	public int getSum() {
		return sum;
	}
}

class People1 extends Thread {
	int timeLength;
	ComputerSum sum;

	public People1(String s, int timeLength, ComputerSum sum) {
		setName(s);
		this.timeLength = timeLength;
		this.sum = sum;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			int m = sum.getSum();
			sum.setSum(m + 1);
			System.out.println(" " + getName() + ", " + sum.getSum());
			try {
				sleep(timeLength);
			} catch (InterruptedException e) {
			}
		}
	}
}
