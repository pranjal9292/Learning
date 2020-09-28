package test;

public class ConstructorwithParameters {
	int a;
	String b;

	public ConstructorwithParameters(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public static void main(String[] args) {
		ConstructorwithParameters construc = new ConstructorwithParameters(1, "Pranjal");
		System.out.println(construc.b);
		System.out.println(construc.a);

	}
}
