package collections_java;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		HashSet<String> HS= new HashSet<String>();

		HS.add("New York");
		HS.add("London");
		HS.add("Paris");
		HS.add("Los Angeles");
		
		Iterator<String> IR = HS.iterator();
		while (IR.hasNext()) {
			System.out.println(IR.next());

	}

}
}