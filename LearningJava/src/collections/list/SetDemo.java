package collections.list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
/*		Set myGenereicSet = new HashSet();
		myGenereicSet.add("pranjal");
		myGenereicSet.add("gourav");
		myGenereicSet.add(113);
		
		System.out.println(myGenereicSet);*/
		
		
		Set<String> myList = new HashSet<>();
		myList.add("pranjal");
		myList.add("gourav");
		myList.add("pranjal");
		myList.add("abc");
		
		System.out.println(myList);
		
		Set<String> mySet = new TreeSet<>();
		mySet.add("pranjal");
		mySet.add("gourav");
		mySet.add("pranjal");
		mySet.add("abc");
		
		System.out.println(mySet);
	}
}
