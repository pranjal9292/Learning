package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> myList = new LinkedList<>();
		myList.add("pranjal");
		myList.add("gourav");
		myList.add("pranjal");
		myList.add("abc");
		
		
		for(String data:myList){
			System.out.println(data);
		}
		
		System.out.println(myList);
		
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(1);
		
		
		for(int i=0; i<numList.size(); i++){
			System.out.println(numList.get(i));
		}
		
		for(Integer data:numList){
			System.out.println(data);
		}
		
	/*	System.out.println(numList);
		
		System.out.println(numList.get(2));*/
	}
}
