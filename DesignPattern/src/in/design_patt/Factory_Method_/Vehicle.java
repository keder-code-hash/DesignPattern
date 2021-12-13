//1. defines the interface of objects the factory method creates.

package in.design_patt.Factory_Method_;

public abstract class Vehicle {
	private String companyName = "";
	private int price=0; 
	protected double prop=0.0;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getProp() {
		return prop;
	}
	public abstract void setProp(double prop);
	
}
