package forE.demo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		// ��ͳ��ʽ
		// Map map = new LinkedHashMap();
		// map.put("1", "aaa");
		// map.put("2", "bbb");
		// map.put("3", "ccc");
		//
		// Set set = map.entrySet();
		// Iterator it = set.iterator();
		//
		// while (it.hasNext()) {
		// Map.Entry entry = (Entry) it.next();
		// String key = (String) entry.getKey();
		// String value = (String) entry.getValue();
		// System.out.println(key+" "+ value);
		// }
		//

		// ��ǿforѭ��
		Map map = new LinkedHashMap();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");

		for (Object object : map.keySet()) {
			String key = (String) object;
			String value = (String) map.get(key);
			System.out.println(key + "  " + value);
		}

	}

	
}
