package conversions;

public class ConversionDemo {
	public static void main(String[] args) {
		int num = 89;

		String myString = String.valueOf(num);

		System.err.println(myString);

		String test = "78";
		int testNum = Integer.parseInt(test);
		System.out.println(num + testNum);

		String testFlost = "78.9";
		System.out.println(testFlost + num);
		
		
		System.out.println();
		float f = Float.parseFloat(testFlost);
		
		System.out.println(f + num);

	}

}
