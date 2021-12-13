// Concrete Builder

package in.design_patt.builder;

public class SmallNonVegPizza extends NonVegPizza{
	public String name() {
		return "small-nonveg pizza";
	};
	public float price() {
		return 120.2f;
	};
	public String size() {
		return "small";
	};

}
