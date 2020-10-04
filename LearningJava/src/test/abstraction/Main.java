package test.abstraction;

public class Main {
	
	public static void main(String[] args) {
		Product product = new ProductImpl();
		System.out.println(product.product(4, 11));
		System.out.println(product.sum(4, 5));
	}

}
