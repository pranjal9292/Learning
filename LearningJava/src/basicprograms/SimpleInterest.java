package basicprograms;
import java.util.Scanner;

public class SimpleInterest {

	public float caclulateInterest(float principalAmount, float rateOfInterest, float time) {
		return (principalAmount * rateOfInterest * time) / 100;
	}

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("**** Simple Interest Calculator****");
		System.out.println("Enter Principal Amount");
		float principalAmount = scann.nextFloat();
		System.out.println("Enter Rate of Interest");
		float rateOfInterest = scann.nextFloat();
		System.out.println("Enter Time");
		float time = scann.nextFloat();

		SimpleInterest simpleInterest = new SimpleInterest();

		System.out.println(
				"Simple Interest is :  " + simpleInterest.caclulateInterest(principalAmount, rateOfInterest, time));
		System.out.println("****Thank You*****");
		scann.close();
	}

}
