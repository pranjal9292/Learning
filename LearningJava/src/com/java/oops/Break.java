package com.java.oops;

public class Break {
	public static void main(String args[]) {
		int arr[] = { 12, 14, 87, 33, 32, 44, 78 };
		for (int i = 0; i < 6; i++) {
			if (i != 32 || i != 44) {
				System.out.println("the number is " + " /" + arr[i] + "found at " + i);
			} else if (i == 32) {
				continue;
			} else if (i == 44) {
				break;
			}
			System.out.println("The list of numbers: " + arr[i]);

		}
	}

}
