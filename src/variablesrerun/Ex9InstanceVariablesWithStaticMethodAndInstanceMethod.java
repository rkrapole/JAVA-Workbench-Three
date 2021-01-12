package variablesrerun;

import java.util.Scanner;

public class Ex9InstanceVariablesWithStaticMethodAndInstanceMethod {

	int a, b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex9InstanceVariablesWithStaticMethodAndInstanceMethod x = new Ex9InstanceVariablesWithStaticMethodAndInstanceMethod();

		Scanner k = new Scanner(System.in);
		System.out.println("enter value of a: ");
		x.a = k.nextInt();
		System.out.println("enter value of a: ");
		x.b = k.nextInt();

		sum();
		x.mul();//**created this instance "x" to access instance method 'mul' under this  static main method//

	}

	private void mul() {
		// TODO Auto-generated method stub
		int mul = a * b;
		System.out.println("multiplication of a * b is: " + mul);

	}

	public static void sum() {
		Ex9InstanceVariablesWithStaticMethodAndInstanceMethod y = new Ex9InstanceVariablesWithStaticMethodAndInstanceMethod();
		//**created this instance "y" to access instance variables under this  static method//
		int sum = y.a + y.b;
		System.out.println("sum of a + b is: " + sum);
	}

}
