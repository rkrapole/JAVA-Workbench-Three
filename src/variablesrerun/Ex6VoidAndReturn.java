package variablesrerun;

import java.util.Scanner;

public class Ex6VoidAndReturn {

	static int a, b, c, sum, sum1, sumretrunresult;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("enter a: ");
		a = k.nextInt();
		System.out.println("enter b: ");
		b = k.nextInt();

		sum(a, b);
		sum1(a, b);
		sumretrunresult = sumRetrun(a, b);
		System.out.println("result of sumretrunresult is :" + sumretrunresult);

	}

	public static void sum(int x, int y) {
		sum = x + y;
		System.out.println("result of sum is: " + sum);

	}

	public static void sum1(int p, int q) {
		Scanner h = new Scanner(System.in);
		System.out.println("enter the value of p: ");
		p = h.nextInt();
		System.out.println("enter the value of q: ");
		q = h.nextInt();

		sum1 = p + q;
		System.out.println("result of sum1 is: " + sum1);
	}

	public static int sumRetrun(int l, int m) {

		sumretrunresult = l + m;
		return sumretrunresult;

	}
}