package datastructure;

public class LinerSearch {
	public static void main(String[] args) {
		// int a[] = new int[5];
		int a[] = { 67, 23, 67, 89, 13, 45, 2 };
		System.out.println(a.length);
		int itemToFind = 2;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == itemToFind) {
				System.out.println("Item Found at " + i);
				break;
			}

		}
	}
}
