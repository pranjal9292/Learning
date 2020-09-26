package basicprograms;

public class Odd {
	public static void main(String args[]) {
		int arr[] = { 12, 113, 109, 33, 35,110 };
		int max = arr[0];
		int secondmax = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			}else if(arr[i] > secondmax){
				secondmax = arr[i];
			}
		}
		System.out.println(secondmax + "   " + max);
	}
}
