package collections_java;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> AL = new ArrayList<String>();
		
		AL.add("Denali");
		AL.add("Mount Elbert");
		AL.add("Mount Whitney");
		AL.add("Mount Sanford");
		AL.add("Mount Bear");
		System.out.println(AL);
		
		AL.add(1, 	"Mount Bona");
		System.out.println(AL);
		
		AL.remove("Mount Bear");
		AL.remove(0);
		System.out.println(AL);
		
		System.out.println(AL.contains("Denal"));
		System.out.println(AL.isEmpty());
		System.out.println(AL.get(3));
		System.out.println(AL.indexOf("Mount Bear"));
		System.out.println(AL.indexOf("Denali"));
		
		
		
		

	}

}
