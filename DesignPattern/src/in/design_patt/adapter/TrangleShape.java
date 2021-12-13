// adaptee class

package in.design_patt.adapter;

public class TrangleShape extends Shape{

	@Override
	public void size() {
		System.out.println("This is size for Triangle");
	}

	@Override
	public void type() {
		System.out.println("This is a triangle");
	}

	@Override
	public void edit() {
		System.out.println("Edit method for triangle");
	}

}
