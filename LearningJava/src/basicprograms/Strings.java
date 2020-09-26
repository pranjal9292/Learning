package basicprograms;

public class Strings {
	public static void main(String[] args){
		String name = new String("pranjal Thakr");
		System.out.println(name.substring(3, 5));
		System.out.println(name.contains("Thakur"));
		
		StringBuilder stringBuilder = new StringBuilder("pranjal Thakr");
		System.out.println(stringBuilder.reverse());
		
		StringBuffer stringBuffer = new StringBuffer("pranjal Thakr");
		System.out.println(stringBuffer.reverse());
		
		
	}
	

}
