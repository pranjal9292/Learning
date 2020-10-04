package test2.polymorphism;

public class Calculator {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	float add(int a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(7, 4));
		System.out.println(calculator.add(3, 4, 5));
		System.out.println(calculator.add(3, 4.5f));
	}

}
