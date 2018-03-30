package collections_java;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {


		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(0, "USA");
		HM.put(1, "Canada");
		HM.put(2, "Australia");
		HM.put(3, "Japan");
		HM.put(4, "Germany");


		System.out.println(HM);
		System.out.println(HM.get(2));
		HM.remove(2);
		System.out.println(HM.get(2));

		System.out.println(HM.values());
		System.out.println(HM.containsKey(3));

		System.out.println(HM.clone());
		System.out.println(HM.containsValue("Japan"));

		HashMap<String, String> HP= new HashMap<String, String>();

		HP.put("Asia", "Japan");
		HP.put("NorthAmerica", "USA");
		HP.put("Europe", "Germany");
		System.out.println(HP);
	}


}

