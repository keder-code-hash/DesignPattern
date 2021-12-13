package in.design_patt.adapter;

public class LineShape extends Shape{

	@Override
	public void size() {
		System.out.println("This is size for Line");
		
	}

	@Override
	public void type() {
		System.out.println("This is for Line");
	}

	@Override
	public void edit() {
		System.out.println("Edit method for Line");
	}

}
