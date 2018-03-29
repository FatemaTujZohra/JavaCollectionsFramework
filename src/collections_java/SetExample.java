package collections_java;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {


		HashSet<String> HS= new HashSet<String>();

		HS.add("New York");
		HS.add("London");
		HS.add("Paris");
		HS.add("Los Angeles");
		HS.add("Los Angeles");
		System.out.println(HS);

		HS.remove("New York");
		System.out.println(HS);

		System.out.println(HS.equals("Tokyo"));

		System.out.println(HS.toArray());

		System.out.println(HS.size());

		System.out.println(HS.clone());
		System.out.println(HS.containsAll(HS));

		System.out.println(HS.getClass());
		System.out.println(HS.toString());

	}

}
