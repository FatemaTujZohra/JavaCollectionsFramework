package collections_java;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> HT = new Hashtable<Integer, String>();
		HT.put(0, "USA");
		HT.put(1, "Canada");
		HT.put(2, "Australia");
		HT.put(3, "Japan");
		HT.put(4, "Germany");
        
		System.out.println(HT);
		Set S= HT.entrySet();//HashMap collections  is converting into Set collections

		// Both Iteration and Enumeration tried as follows here
		Enumeration ER= (Enumeration<String>) S.iterator();

		while (ER.hasMoreElements())

		{ Map.Entry mp= (Map.Entry)ER.nextElement();
		
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	}
		
		Iterator It= S.iterator();

		while (It.hasNext())

		{ Map.Entry mp= (Map.Entry)It.next();
		
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());


		}

}
}
