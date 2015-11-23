import java.util.Collections;
import java.util.ArrayList;

//����˹����
@SuppressWarnings("rawtypes")
class Bian implements Comparable// ����֮��ļ�Ȩ��
{
	private int first, second;// ��ʾһ���ߵ������ڵ�
	private int value;// Ȩֵ

	public Bian(int first, int second, int value) {
		this.first = first;
		this.second = second;
		this.value = value;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	public int getValue() {
		return value;
	}

	public int compareTo(Object arg0) {
		return value > ((Bian) arg0).value ? 1
				: (value == ((Bian) arg0).value ? 0 : -1);
	}

	@Override
	public String toString() {
		return "Bian[first=" + first + ",second=" + second + ",value=" + value
				+ "]";
	}
}

class ShuZu {
	@SuppressWarnings("rawtypes")
	static ArrayList<ArrayList> list = new ArrayList<ArrayList>();// ���ÿһ�������еĽڵ������
	@SuppressWarnings("rawtypes")
	static ArrayList<ArrayList> bianList = new ArrayList<ArrayList>();// ��Ӧ��������еıߵ�����

	@SuppressWarnings({ "unchecked" })
	public static void check(Bian b)// ������ĸ�������
	{
		if (list.size() == 0) {
			ArrayList<Integer> sub = new ArrayList<Integer>();
			sub.add(b.getFirst());
			sub.add(b.getSecond());
			list.add(sub);
			ArrayList<Bian> bian = new ArrayList<Bian>();
			bian.add(b);
			bianList.add(bian);
			return;
		}
		int first = b.getFirst();
		int shuyu1 = -1;
		int second = b.getSecond();
		int shuyu2 = -1;
		for (int i = 0; i < list.size(); i++)// ��������ڵ�ֱ������ĸ�����
		{
			for (int m = 0; m < list.get(i).size(); m++) {
				if (first == (Integer) list.get(i).get(m))
					shuyu1 = i;
				if (second == (Integer) list.get(i).get(m))
					shuyu2 = i;
			}
		}
		if (shuyu1 == -1 && shuyu2 == -1)// ��ʾ�������ڵ㶼û����Ҫ�¼���
		{
			ArrayList<Integer> sub = new ArrayList<Integer>();
			sub.add(b.getFirst());
			sub.add(b.getSecond());
			list.add(sub);
			ArrayList<Bian> bian = new ArrayList<Bian>();
			bian.add(b);
			bianList.add(bian);
		}
		if (shuyu1 == -1 && shuyu2 != -1)// ��ʾ��һ�����Ѿ���������ֻ����һ������Ϳ�����
		{
			list.get(shuyu2).add(first);
			bianList.get(shuyu2).add(b);
		}
		if (shuyu2 == -1 && shuyu1 != -1)// ��ʾ��һ�����Ѿ���������ֻ����һ������Ϳ�����
		{
			list.get(shuyu1).add(second);
			bianList.get(shuyu1).add(b);
		}
		if (shuyu1 == shuyu2 && shuyu1 != -1)// ����������ͬһ�����л��γɻ�
		{
		}
		if (shuyu1 != shuyu2 && shuyu1 != -1 && shuyu2 != -1)// ��ʾ�������ڲ�ͬ��������Ҫ�ϲ�
		{
			for (int i = 0; i < list.get(shuyu2).size(); i++) {
				list.get(shuyu1).add(list.get(shuyu2).get(i));
			}
			list.remove(shuyu2);
			for (int i = 0; i < bianList.get(shuyu2).size(); i++) {
				bianList.get(shuyu1).add(bianList.get(shuyu2).get(i));
			}
			bianList.get(shuyu1).add(b);
			bianList.remove(shuyu2);
		}
	}

	public static void show() {
		for (int i = 0; i < bianList.get(0).size(); i++)
			System.out.println(bianList.get(0).get(i));
	}
}

public class Kruskal {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Bian> l = new ArrayList<Bian>();
		l.add(new Bian(1, 3, 1));
		l.add(new Bian(1, 2, 6));
		l.add(new Bian(1, 4, 5));
		l.add(new Bian(2, 3, 5));
		l.add(new Bian(2, 5, 3));
		l.add(new Bian(3, 4, 5));
		l.add(new Bian(3, 5, 6));
		l.add(new Bian(3, 6, 4));
		l.add(new Bian(4, 6, 2));
		l.add(new Bian(5, 6, 6));
		Collections.sort(l);
		// for(inti=0;i<l.size();i++)
		// System.out.println(l.get(i));
		for (int i = 0; i < l.size(); i++)
			ShuZu.check(l.get(i));
		ShuZu.show();
		System.exit(0);
	}
}