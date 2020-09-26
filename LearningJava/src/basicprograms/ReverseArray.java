package basicprograms;

public class ReverseArray {
	public static void main(String[] args) {
		Integer[] intArr = { 1, 98, 39, 90, 850, 6900, 0, 30, 9 };
		System.out.println("Original Array:");
		for (int i = 0; i < intArr.length; i++)
			System.out.print(intArr[i] + "  ");

		System.out.println();
		System.out.println("reverse array ");
		for (int i = intArr.length - 1; i >= 0; i--)
			System.out.print(intArr[i] + "  ");
	}
}
