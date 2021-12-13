// client Side View


package in.design_patt.builder;

import java.io.IOException;

public class OrderBuilderInit {
	public static void main(String[] args) throws NumberFormatException, IOException {
		OrderBuilder orderBuilderInit=new OrderBuilder();
		OrderItems orderItems=orderBuilderInit.PreparePizzaByUerChoice();
		orderItems.showOrders();
		System.out.println("Total Price: -"+orderItems.getTotalCost());
	}
}
