package test;

public class MethodOverriding {
	int sum(int a,int b)
	{
		return a+b;
	}
	int sum(int a,int b,int c)
	{
		
		System.out.println("Sum of three integers ");
		return a+b+c;
	}
	public static void main(String[] args)
	{
		MethodOverriding summ = new MethodOverriding();
		System.out.println(summ.sum(3,7,9));
		
	}

}
