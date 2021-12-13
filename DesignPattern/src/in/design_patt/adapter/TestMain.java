// class adapter

package in.design_patt.adapter;

public class TestMain {
	public static void main(String[] args) {
		Shape Line=new LineShape();
		Line.edit();
		Line.size();
		Line.type();
		
		TextView textToolkit=new TextView();
		textToolkit.view();
		textToolkit.delete();

		textToolkit.edit();
		textToolkit.size();
		textToolkit.type();
	}
	
}
