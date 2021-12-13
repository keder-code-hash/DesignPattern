package in.design_patt.iterator;

public class TestMain {
	public static void main(String[] args) {
		WordBag wordBag=new WordBag();
		
		Iterator itrIterator=wordBag.getIterator();
		
		while(itrIterator.hasNext()) {
			System.out.println((String)itrIterator.next());
		}
	} 
}
