package basicprograms;

public class DsImpl extends SimpleInterest implements Ds,Calculator{

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

}
