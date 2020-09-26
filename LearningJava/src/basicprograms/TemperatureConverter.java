package basicprograms;
import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		float tc = scann.nextFloat();
		System.out.println("The temp in fahrenheit is " + (((9 / 5) * tc) + 32));
		scann.close();
	}
}
