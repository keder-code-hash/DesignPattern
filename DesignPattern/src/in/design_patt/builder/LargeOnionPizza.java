// Concrete Builder

package in.design_patt.builder;

public class LargeOnionPizza extends VegPizza{
	public String name() {
		return "Large-onion pizza";
	};
	public float price() {
		return 370.2f;
	};
	public String size() {
		return "large";
	};
}
