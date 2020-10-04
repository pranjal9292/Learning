package test2.overriding;

public class Derived extends Base {
	
	@Override
	int sum(int a, int b) {
		int addition = a+ b;
		System.out.println(" Sum is " + addition);
		return addition;
	}
}
