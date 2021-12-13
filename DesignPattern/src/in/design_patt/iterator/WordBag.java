package in.design_patt.iterator;

public class WordBag {
	public String words[]= {"k","e","d","e","r"};
	
	public WordIterator getIterator() {
		return new WordIterator();
	}
	public class WordIterator implements Iterator{
		public int counter=0;
		public boolean hasNext() { 
			if(counter<words.length) {
				return true;
			}
			return false;
		}
	 
		public Object next() { 
			if(this.hasNext()) {
				return words[counter++];
			}
			return null;
		}

	} 

}
