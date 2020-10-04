package abstraction;

public class CollectionMainDemo {
	public static void main(String[] args) {

		CollectionDemo collectionDemo = new HashSetDemo();
		collectionDemo.add(67);
		collectionDemo.add(78);
		collectionDemo.add(78);

		collectionDemo.print();
	}
}
