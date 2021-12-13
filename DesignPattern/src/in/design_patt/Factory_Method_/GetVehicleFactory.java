package in.design_patt.Factory_Method_; 

public class GetVehicleFactory { 
	public Vehicle getVehicle(String vehicleType) {
		if(vehicleType==null) {
			return null;
		}
		else if(vehicleType.equals("H")) {
			return new HeavyMotorVehicle();
		}
		else if(vehicleType.equals("L")) {
			return new LightMotorVehicle();
		}
		else {
			return null;
		}
	}
}
