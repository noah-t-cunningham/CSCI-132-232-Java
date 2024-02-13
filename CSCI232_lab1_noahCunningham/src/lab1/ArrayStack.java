package lab1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStack<E> implements Iterable<Object> {
    private Object[] a;  // holds the items
    private int N;       // number of items in stack


    // create an empty stack with given capacity
    public ArrayStack(int capacity) {
        a  = new Object[capacity];
        N = 0;
    }

    public boolean isEmpty() {  
        return N == 0;                    
    }
    
    public boolean isFull() {  
        return N == a.length;             
    }
    
    public void push(E item) {
        a[N++] = item;    
//        System.out.println("length: "+a.length);
//        System.out.println("N: "+N);
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
		// create variables
		ArrayStack AS = new ArrayStack<>(100);
		ArrayStack AS2 = new ArrayStack<>(100);
		File file1 = new File ("numbers.txt");
		File file2 = new File ("tinyTale.txt"); 
		Object o;
		Scanner scan1 = new Scanner(file1);
		Scanner scan2 = new Scanner(file2);
		
		//iterates through file and pushes each element on to AS
		while(scan1.hasNext()) {
			o = scan1.next();
			AS.push(o);
			//System.out.println(o);
			}
		//iterates through file and pops each element on to AS
		while(!AS.isEmpty()) {
		System.out.println(AS.pop());
		}
		//iterates through file and pushes each element on to AS
		while(scan2.hasNext()) {
			o = scan2.next();
			AS2.push(o);
			//System.out.println(o);
			}
		//iterates through file and pops each element on to AS
		while(!AS2.isEmpty()) {
			System.out.println(AS2.pop());
			}
		
	}
} 

