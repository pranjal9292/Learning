package test;

public class SecondDerived extends FirstDerived {
	int multiply(int a, int b) {
		return (a / b);
	}
public static void main(String[] args)
{SecondDerived summ = new SecondDerived();
System.out.println("The sum is" +summ.sum(3,8));

}
}
