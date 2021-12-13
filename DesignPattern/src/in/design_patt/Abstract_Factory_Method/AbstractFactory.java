// AbstractFactory (abstract method for choosing the product of factory)

package in.design_patt.Abstract_Factory_Method;

public abstract class AbstractFactory {
	public abstract BasicUser getUser(String userType); 
}
