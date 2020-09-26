package datastructure;

public class HelloWorld {

	void sayHi(String name) {
		System.out.println("Hi " + name + " !");
	}
	
	int sum(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHi("Pranjal");
		helloWorld.sayHi("Samrath");
		System.out.println(helloWorld.sum(5, 45678));
	}
}
