package forE.demo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		// 传统方式
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

		// 增强for循环
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
