// Concrete Factory( implementing the actual Logic)


package in.design_patt.Abstract_Factory_Method;

public class SimpleOperations implements BasicUser{
	public int addition(int a,int b) {
		return a+b;
	}
	public int substraction(int a,int b) {
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
}

