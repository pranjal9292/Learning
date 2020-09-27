package test;

public class Average {
	public static void main(String[] args) {
		int arr[] = { 5, 45, 10, 20, 15 };
		int sum = 0;
		int avg = 0;
		for (int i = 0;i<= arr.length-1;i++) {
			sum =sum + arr[i];
		}
		avg = (sum / (arr.length));

	System.out.println("The average is" + avg);
}
}
