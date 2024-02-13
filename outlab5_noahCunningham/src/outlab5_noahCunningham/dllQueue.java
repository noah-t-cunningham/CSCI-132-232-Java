package outlab5_noahCunningham;

public class dllQueue<E> implements Queue<E> {
	
private DoublyLinkedList<E> DLLQ = new DoublyLinkedList<>();
	
	public dllQueue() {
		
	}

	/**
	 * Returns the number of items in the queue
	 * @return number of elements in the queue
	 */
	public int size() {
		return DLLQ.size();
	}
	
	/**
	 * Returns true if the stack is empty, otherwise false
	 * @return true if empty, else false
	 */
	public boolean isEmpty() {
		return DLLQ.isEmpty();
	}
	
	/**
	 * Adds an element to the back of the queue
	 * @param e the element to be added to the queue
	 */	
	public void enqueue(E e) {
		DLLQ.addLast(e);
	}
	
	/**
	 * Returns the top element of the queue but doesn't remove it
	 * Comparable to the peek() method in java.util.Queue
	 * @return the top element of the stack
	 */
	public E first() {
		return DLLQ.first();
	}
	
	/**
	 * Removes the front element of the queue and returns the element.
	 * @return the front element of the queue
	 */
	public E dequeue() {
		return DLLQ.removeFirst();
	}
	
	public String toString() {
		return DLLQ.toString();
	}

}
