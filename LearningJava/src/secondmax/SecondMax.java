package secondmax;

public class SecondMax {
	public static void main(String[] args) {
		int temp;

		int arr[] = { 22, 43, 34, 66, 23, 342 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("The secondmax from array is " + arr[arr.length - 1]);

	}
}
