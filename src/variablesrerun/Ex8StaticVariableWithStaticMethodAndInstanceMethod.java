package variablesrerun;

import java.util.Scanner;

public class Ex8StaticVariableWithStaticMethodAndInstanceMethod {
	
	static int a, b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		System.out.println("enter value of a: ");
		a = k.nextInt();
		System.out.println("enter value of b: ");
		b = k.nextInt();
		
		Ex8StaticVariableWithStaticMethodAndInstanceMethod x = new Ex8StaticVariableWithStaticMethodAndInstanceMethod();
		sum();
		x.mul();;//**created this instance "x" to access instance method 'mul' under this  static main method//
	}
	
	public static void sum() {//static method
		int sum = a + b;
		System.out.println("sum of a + b is: "+sum);
	}
	public void mul() {
		int mul = a * b;
		System.out.println("multiplication if a * b is: "+mul);
	}
}
