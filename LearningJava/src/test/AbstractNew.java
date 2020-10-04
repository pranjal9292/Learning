package test;

public class AbstractNew extends Abstract {
	int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		AbstractNew summ = new AbstractNew();
		System.out.println(summ.division(9, 10));
	}

}
