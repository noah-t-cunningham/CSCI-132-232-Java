package Week2;

import week1.Counter;

public class CounterDemo {

	public static void main(String[] args) {
		
		Counter c;							// declare a reference variable of type Counter
		c = new Counter();					// construct a new object and assign its reference to c
		c.increment();						// increment the object referenced by c
		c.increment(3);						// increment it by 3 more
		int temp = c.getCount();			// the value is now 4
		System.out.println(temp);			// verify that the values is 4
		
		c.reset();							// set c back to 0
		System.out.println(c.getCount()); 	// check that it is 0
		
		Counter d = new Counter(5);			// declare and construct reference variable d
		d.increment();						// increment to 6
		System.out.println(d.getCount());	// check that it is 6
		
		Counter e;							// declare reference variable e of type Counter
		e = d;								// assign the object reference by d to e as well
		temp = e.getCount();				// set temp to the int returned from the e object
		System.out.println(temp);			// will be 6 (d and e reference the same object)
		
		e.increment(2);						// increment to 8 e as well as d
		System.out.println(e.getCount());	// check that e is 8
		System.out.println(d.getCount());	// check that d is 8 
		
	}
}
