// Director

package in.design_patt.builder;

import java.util.Vector;

public class OrderItems {
	Vector<Item> items=new Vector<Item>();
	public void add(Item i) {
		items.add(i);
	}
	public float getTotalCost() {
		float price=0.0f;
		for(Item item:items) {
			price+=item.price();
		}
		return price;
	}
	public void showOrders() {
		for(Item item:items) {
			System.out.println("Price : -"+item.price());
			System.out.println("Size : - "+item.size());
			System.out.println("name : - "+item.name());
		}
	}
}
