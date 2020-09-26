package basicprograms;

public class Pattern {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 6; i++) {
			for (int k = 1; k<= i; k++) {
				System.out.print(" ");
			}
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
