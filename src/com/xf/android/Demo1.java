package com.xf.android;

import java.util.ArrayList;
import java.util.HashMap;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Demo1 {
	static int i;

	public static void main(String[] args) {
		// System.out.println(i);
		// int x = 20, y = 30;
		// boolean b;
		// b = x < 50 && y < 60 || x > 50 && y < -60 || x < -50 && y > 60 || x <
		// -50 && y < -60;
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("UserName", "ZHULI");
		jsonObject.put("age", "30");
		jsonObject.put("workIn", "ALI");
		System.out.println("jsonObject1£º" + jsonObject);

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("UserName", "ZHULI");
		hashMap.put("age", "30");
		hashMap.put("workIn", "ALI");
		System.out.println("jsonObject2£º" + JSONObject.toJSON(hashMap));

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ZHULI");
		arrayList.add("30");
		arrayList.add("ALI");
		System.out.println("jsonArray2£º" + JSONArray.toJSON(arrayList));

		JSONArray jsonArray = new JSONArray();
		jsonArray.add(0, "ZHULI");
		jsonArray.add(1, "30");
		jsonArray.add(2, "ALI");
		jsonArray.add(3, jsonObject);
		System.out.println("jsonArray1£º" + jsonArray);

		// JSONObject jsonObject2 = new JSONObject();
		// jsonObject2.put("UserName", "ZHULI");
		// jsonObject2.put("age", "30");
		// jsonObject2.put("workIn", "ALI");
		// jsonObject2.put("Array", arrayList);
		// System.out.println("jsonObject2£º" + jsonObject2);
	}
}
