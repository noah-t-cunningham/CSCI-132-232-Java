package lab1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class RArrayStack<E> implements Iterable<Object> {
    private Object[] a;  // holds the items
    private int N;       // number of items in stack


    // create an empty stack with given capacity
    public RArrayStack() {
        a  = new Object[8];
        N = 0;
    }
    
    //resize method, creates new object list with double capacity,
    //uses for loop to copy each element form a to b, set a = b to ensure 
    //that it doesnt rest the list
    public void resize(int capacity) {
    	Object[] b = new Object[capacity*2];
    	for(int i=0;i<capacity;++i){
			b[i]=a[i];
		}
    	a=b;
    }
    
    public boolean isEmpty() {  
        return N == 0;                    
    }
    
    public boolean isFull() {  
        return N == a.length;             
    }
    
    public void push(E item) {
    	// if statement that triggers resize
    	if(a.length == N) {
    		resize(a.length);
    		//System.out.println("hi");
    	}                   
    	a[N++] = item;    
//    	System.out.println("N: "+N);
//    	System.out.println("length: "+a.length);
    }
    
    public Object pop() {  
        return a[--N];                    
    }
    
    public Object peek() {
        return a[N-1];                    
    }
    
    public Iterator<Object> iterator() { 
        return new ReverseArrayIterator(); 
    }

    public class ReverseArrayIterator implements Iterator<Object> {
        private int i = N-1;

        public boolean hasNext() {
            return i >= 0;
        }

        public Object next() { 
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
        
       
    }
    
	public static void main(String[] args) throws FileNotFoundException {
		
		RArrayStack RAS = new RArrayStack<>();
		RArrayStack RAS2 = new RArrayStack<>();
		File file1 = new File ("numbers.txt");
		File file2 = new File ("tinyTale.txt"); 
		Object o;
		Scanner scan1 = new Scanner(file1);
		Scanner scan2 = new Scanner(file2);
		
		//RAS.push();
		while(scan1.hasNext()) {
			o = scan1.next();
			RAS.push(o);
			//System.out.println("0: "+o);
			}
		while(!RAS.isEmpty()) {
		System.out.println(RAS.pop());
		//RAS.pop();
		}
		
		while(scan2.hasNext()) {
			o = scan2.next();
			RAS2.push(o);
			//System.out.println(o);
			}
		while(!RAS2.isEmpty()) {
			System.out.println(RAS2.pop());
			//RAS2.pop();
			}
		
	}
} 

