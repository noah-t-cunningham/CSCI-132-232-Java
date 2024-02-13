package outlab5_noahCunningham;


public class dllStack<E> implements Stack<E> {
	
	private DoublyLinkedList<E> DLLS = new DoublyLinkedList<>();
	
	public dllStack() {
		
	}
	
	public int size() {
		return DLLS.size();
	}

	/**
	 * Returns true if the stack is empty, otherwise false
	 * @return true if empty, else false
	 */
	public boolean isEmpty() {
		return DLLS.isEmpty();
	}
	
	/**
	 * Adds an element to the top of the stack
	 * @param e the element to be added to the stack
	 */	
	public void push(E e) {
		DLLS.addFirst(e);
	}
	
	/**
	 * Returns the top element of the stack but doesn't pop it off.
	 * Comparable to the peek() method in java.util.Stack
	 * @return the top element of the stack
	 */
	public E top() {
		return DLLS.first();
	}
	
	/**
	 * Pops the top element of the stack and returns the element.
	 * @return the top element of the stack
	 */
	public E pop() {
		return DLLS.removeFirst();
	}
	

	public String toString() {
		return DLLS.toString();
	}

}
