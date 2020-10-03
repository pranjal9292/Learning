package test2;

public class ZPattern {
	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 11; i++) {
			for (j = i; j < 11; j++) {
				if (i == 0 || i == 10 || j == 10 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
}
