// Director


package in.design_patt.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

public class OrderBuilder {
	public OrderItems PreparePizzaByUerChoice() throws NumberFormatException, IOException {

		OrderItems orderItems=new OrderItems();
		
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("Enter the choice for order pizza : ");
		System.out.println("1.Veg");
		System.out.println("2.NonVeg");
		
		int choice=Integer.parseInt(bReader.readLine());
		
		switch (choice) {
			case 1:
			{
				System.out.println("Enter the choice for order Veg pizza : ");
				System.out.println("1.Small-Onion Pizza");
				System.out.println("2.Large-Onion Pizza");
				System.out.println("3.Exit");
				int ch=Integer.parseInt(bReader.readLine());
				switch (ch) {
				case 1:
				{
					orderItems.add(new SmallOnionPizza());
					break;
				}
				case 2:
				{
					orderItems.add(new LargeOnionPizza());
					break;
				}
				default:
					break;
				}
				break;
			}
			case 2:
			{
				System.out.println("Enter the choice for order Non-Veg pizza : ");
				System.out.println("1.Small-Nonveg Pizza");
				System.out.println("2.Large-Nonveg Pizza");
				System.out.println("3.Exit");
				int ch=Integer.parseInt(bReader.readLine());
				switch (ch) {
				case 1:
				{
					orderItems.add(new SmallNonVegPizza());
					break;
				}
				case 2:
				{
					orderItems.add(new LargeNonVegPizza());
					break;
				}
				default:
					break;
				}
				break;
			}
			default:
				break;
			}
			bReader.close();
			return orderItems;
		}
}
