//   ConcreteFactory(have the logic to choose the product)

package in.design_patt.Abstract_Factory_Method;

public class CalculatorFactory extends AbstractFactory{ 
	public BasicUser getUser(String userType) { 
		if(userType == null) {
			return null;
		}
		else if(userType.equalsIgnoreCase("basic")) {
			return new SimpleOperations();
		}
		else if(userType.equalsIgnoreCase("advance")) {
			return new ScientificOperations();
		}
		return null;
	}

}
