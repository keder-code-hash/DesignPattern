package in.design_patt.Abstract_Factory_Method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 

public class TestMain {
	public static void main(String[] args) {
		BufferedReader bfReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the user Type: ");
		try {
			String userType=bfReader.readLine();
			//choosing the factory by Factory Creator(abstract)
			AbstractFactory abstractFactory=FactoryCreator.getFactoryType("cal");

			if(userType.equalsIgnoreCase("basic")) {
				BasicUser basicUser =abstractFactory.getUser(userType);
				System.out.println("addition from basic: "+basicUser.addition(1,12));
				System.out.println("multplication: "+basicUser.multiplication(1,12));
				
			}
			else if(userType.equalsIgnoreCase("advance")) {
				System.out.println("hii");
				AdvanceUser advanceUser=(AdvanceUser) abstractFactory.getUser(userType);
				System.out.println("addition from advance: "+advanceUser.addition(1,12));
				System.out.println("Exponent: "+advanceUser.exp(1,12));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
