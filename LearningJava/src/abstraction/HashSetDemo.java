package abstraction;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo implements CollectionDemo {

	Set<Integer> mySet = new HashSet<>();

	@Override
	public void add(Integer value) {
		mySet.add(value);

	}

	@Override
	public void print() {
		System.out.println(mySet);
	}

}
