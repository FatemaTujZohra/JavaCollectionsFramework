package collections_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Converting_HashMap_to_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(0, "USA");
		HM.put(1, "Canada");
		HM.put(2, "Australia");
		HM.put(3, "Japan");
		HM.put(4, "Germany");

		Set S= HM.entrySet();//HashMap collections  is converting into Set collections

		// Iteration part follows here
		Iterator It= S.iterator();

		while (It.hasNext())

		{ Map.Entry mp= (Map.Entry)It.next();
		
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());


		}

	}
}