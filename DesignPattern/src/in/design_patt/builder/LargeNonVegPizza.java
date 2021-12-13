// Concrete Builder

package in.design_patt.builder;

public class LargeNonVegPizza extends NonVegPizza {
	public String name() {
		return "large-nonveg pizza";
	};
	public float price() {
		return 320.2f;
	};
	public String size() {
		return "large";
	};
}
