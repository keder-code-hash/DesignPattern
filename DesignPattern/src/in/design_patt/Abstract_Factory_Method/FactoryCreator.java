package in.design_patt.Abstract_Factory_Method;

public abstract class FactoryCreator {
	public static AbstractFactory getFactoryType(String choice) {
		if(choice== null) {
			return null;
		}
		else if(choice.equalsIgnoreCase("cal")) {
			return new CalculatorFactory();
		}
		return null;
	}
}
