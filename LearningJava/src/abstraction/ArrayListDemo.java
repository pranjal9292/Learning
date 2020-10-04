package abstraction;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo implements CollectionDemo {

	List<Integer> myList = new ArrayList<Integer>();

	@Override
	public void add(Integer value) {
		myList.add(value);
	}

	@Override
	public void print() {
		System.out.println(myList);
	}

	
	
}
