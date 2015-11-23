import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Example3 {
	public static void main(String[] args) {
		// char[] a = { 'A', 'B', 'c', 'd', 'E' };

		LinkedList<Integer> lk = new LinkedList<Integer>();

		ArrayList<Character> al = new ArrayList<Character>();
		al.add('A');
		al.add('B');
		al.add('c');
		al.add('d');
		al.add('E');

		Iterator<Character> it = al.iterator();

		while (it.hasNext()) {
			char b;
			char a = it.next().charValue();
			if (Character.isLowerCase(a)) {
				b = Character.toUpperCase(a);
			} else {

				System.out.print(Character.toLowerCase(a));
			}
			// System.out.print(it.next());
		}

		// for (int i = 0; i < a.length; i++) {
		// if (Character.isLowerCase(a[i]))
		// a[i] = Character.toUpperCase(a[i]);
		// else if (Character.isUpperCase(a[i]))
		// a[i] = Character.toLowerCase(a[i]);
		// }
		// for (int i = 0; i < a.length; i++)
		// System.out.print(a[i]);

		System.out.print(al);
	}
}
