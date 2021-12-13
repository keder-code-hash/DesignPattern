// Concrete Factory( implementing the actual Logic)


package in.design_patt.Abstract_Factory_Method;

public class ScientificOperations extends SimpleOperations{
	public double log(int num,int base) {
		return Math.log(num)/Math.log(base);
	}
	public double exp(int num,int p) {
		return Math.pow(num, p);
	}
	public int modulo(int a,int b) {
		return a%b;
	}
}
