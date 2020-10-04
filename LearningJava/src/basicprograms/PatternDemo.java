package basicprograms;


/*
 * Pattern program
 *  **********
 *   *********
 *    ********
 *     *******
 *      ******
 *       *****
 *        ****
 *         ***
 *          **
 *           *
 *  
 */
public class PatternDemo {
	public static void main(String[] args) {

		int num = 11;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 11; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
