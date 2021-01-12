package variablesrerun;

public class Ex4InstanceVariables {
	int a = 77, b = 33, c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4InstanceVariables obj1 = new Ex4InstanceVariables();
		obj1.c = obj1.a-obj1.b;
		System.out.println("Difference between a and b is: "+obj1.c);
		
	}

}
