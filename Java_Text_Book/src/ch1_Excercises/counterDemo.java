package ch1_Excercises;

public class counterDemo {
	public static void main(String args[]) {
		counter c;
		c = new counter();
		c.increment();
		c.increment(3);
		int temp = c.getCount();
		c.reset();
		counter d = new counter(5);
		d.increment();
		counter e = d;
		temp = e.getCount();
		e.increment(2);	
	}
}
