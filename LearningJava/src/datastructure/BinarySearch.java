package datastructure;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 11, 23, 35, 45, 57, 65, 92 };

		int first = 0;
		int last = arr.length-1;
		int mid = (first + last) / 2;

		int itemToFind = 57;

		while (first <= last) {

			if (arr[mid] == itemToFind) {
				System.out.println("Element is found at index: " + mid);
				break;
			}else if (arr[mid] < itemToFind) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}
}
