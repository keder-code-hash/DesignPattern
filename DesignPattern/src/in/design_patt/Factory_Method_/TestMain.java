package in.design_patt.Factory_Method_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 

public class TestMain {

	public static void main(String[] args) { 
		GetVehicleFactory getVF=new GetVehicleFactory();
		ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
		
		BufferedReader bReader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the vehicle type: "); 
		try {
			String vehicleType=bReader.readLine();
			Vehicle vehicle=getVF.getVehicle(vehicleType);
			if(vehicleType.equals("L")) {
				try {
					int price=Integer.parseInt(bReader.readLine());
					String name=bReader.readLine();
					double mileage=Double.parseDouble(bReader.readLine());
					vehicle.setCompanyName(name);
					vehicle.setPrice(price);
					vehicle.setProp(mileage);
					vehicles.add(vehicle);
				} catch (NumberFormatException | IOException e) { 
					e.printStackTrace();
				} 
			}
			else if(vehicleType.equals("H")) {
				try {
					int price=Integer.parseInt(bReader.readLine());
					String name=bReader.readLine();
					double cap=Double.parseDouble(bReader.readLine());
					vehicle.setCompanyName(name);
					vehicle.setPrice(price);
					vehicle.setProp(cap);
					vehicles.add(vehicle);
				} catch (NumberFormatException | IOException e) { 
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Wrong Choice");
			}
		} catch (IOException e) { 
			e.printStackTrace();
		}
		for(Vehicle v:vehicles) {
			System.out.println("name : "+v.getCompanyName());
			System.out.println("price : "+v.getPrice());
			System.out.println("prop : "+v.getProp());
		}
	}

}
