package datastructure;

public class Array {

	public static void main(String[] args) {
		int myArr[] = { 23, 45, 65, 23, 45, 65, 34, 34, 23, 78 };

		//int sum = 0;

		//for (int i = myArr; i++) {
			for (int i = myArr.length-1;i>=0;i--)//|| myArr[i] % 5 == 0);
			{
				System.out.println(myArr[i]);
			}
		}

		//System.out.println(sum / myArr.length);
	}

