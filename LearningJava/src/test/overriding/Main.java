package test.overriding;

public class Main {
	public static void main(String[] args) {
     Derived base = new Derived();
     System.out.println(base.sum(4, 5));
	}
}
