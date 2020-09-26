package com.java.oops;

public class duplicate {
	public static void main(String args[]) {
		int arr[] = { 33, 23, 67, 44, 23, 34 };
		
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("The duplicate num is " + arr[i]);
			}
		}

	}
}
