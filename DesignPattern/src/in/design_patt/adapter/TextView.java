// adaptee class

package in.design_patt.adapter;

public class TextView extends Shape implements Toolkit{

	@Override
	public void size() {
		System.out.println("This is size for TextView");
	}

	@Override
	public void type() {
		System.out.println("TextView");
		
	}

	@Override
	public void delete() {
		System.out.println("delete method for TextView of Toolkit Interface.Common for all");
	}

	@Override
	public void view() {
		System.out.println("view method for TextView of Toolkit Interface.Common for all");
		
	}

	@Override
	public void edit() {
		System.out.println("edit method for TextView");
	}
	
}
