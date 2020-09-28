package test;

public class Methodoverloading {
	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int d) {
		return a + b + d;
	}

	public static void main(String[] args) {
		Methodoverloading summ = new Methodoverloading();
		System.out.println(summ.sum(4, 8));

	}

}
