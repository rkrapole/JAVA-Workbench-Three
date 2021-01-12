package variablesrerun;

import java.util.Scanner;

public class Ex7MethodOverloading {

	static int a, b, c, sumresult;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		System.out.println("enter the value of a: ");
		a = k.nextInt();
		System.out.println("enter the value of b: ");
		b = k.nextInt();
		System.out.println("enter the value of c: ");
		c = k.nextInt();

		sumresult = sum(a, b, c);
		System.out.println("result of return method is: " + sumresult);

		sum(a, b);
	}

	public static int sum(int x, int y, int z) {
		sumresult = x + y + z;
		return sumresult;

	}

	public static void sum(int p, int q) {//method with the same name but different signature, different parameters -> Method Overloading.
		int sum = p + q;
		System.out.println("result of void method is: " + sum);
	}

}
