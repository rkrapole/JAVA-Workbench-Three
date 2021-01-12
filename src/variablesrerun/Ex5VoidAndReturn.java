package variablesrerun;

import java.util.Scanner;

public class Ex5VoidAndReturn {
	static int a, b, sum, sumReturn, sumReturnResult;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("enter a: ");
		a = k.nextInt();
		System.out.println("enter b: ");
		b = k.nextInt();

		sum();
		sumReturnResult = sumReturn(a,b);
		System.out.println("sumReturn result is: " + sumReturn);

	}

	public static void sum() {
		sum = a + b;
		System.out.println("sum result is: " + sum);
	}

	public static int sumReturn(int p, int q) {
		sumReturn = p+q;
		return sumReturn;

	}

}
