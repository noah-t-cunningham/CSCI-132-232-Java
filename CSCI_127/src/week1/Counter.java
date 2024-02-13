package week1;

public class Counter {
	
	// Fields (instance variables)
	private int count;
	
	// Constructors
	public Counter() { 
	} 
	public Counter (int initial) {
		count = initial;
	}
	
	// Methods
	public int getCount() { 
		return count; 
	}
	public void increment() {
		count++; 
	}
	public void increment (int delta) {
		count += delta;
	}
	public void reset () {
		count = 0;
	}
	
	public void setCount(int setMe) {
		count = setMe;
	}
	

}