package outlab5_noahCunningham;
/** E is generic type, have to declare in class or else i cannot be resolved **/
public class DoublyLinkedList<E> {
	
	private static class Node <E> {
		/** sets the fields for node**/
		E element;
		Node<E> prev; 
		Node<E> next;
		
		/** node constructor, implements the fields**/
		public Node(E e, Node<E> p, Node<E> n) {
			this.element = e;
			this.prev = p;
			this.next = n;
		}
		
		/**the various methods to get things in the node**/
		public E getElement() {
			return element;
		}
		public Node<E> getPrev() {
			return this.prev;
		}
		public Node<E> getNext() {
			return this.next;
		}
		public void setPrev(Node<E> p) {
			this.prev = p;
		}
		public void setNext(Node<E> n) {
			this.next = n;
		}

	}
	
	/** sets the fields for doubly linked list**/
	private Node<E> header;
	private Node<E> trailer;
	int size;
	
	/**  doubly linked list constructor, implements the fields**/
	public DoublyLinkedList() { 
		this.header = new Node<>(null, null, null);
		this.trailer = new Node<>(null, this.header, null);
		this.header.setNext(this.trailer);;
	}
	
	/**the various methods to get things in the doubly linked list**/
	public int size() {
		return size;
	}
	/**if the list is empty return nothing, otherwise return the first element in
	 * in the node **/
	public E first() {
		if (isEmpty()) {
			return null;
		}
		return this.header.next.getElement();
	}
	/**if the list is empty return nothing, otherwise return the last element in
	 * in the node**/
	public E last () {
		if (isEmpty()) {
			return null;
		}
		return this.trailer.prev.getElement();
	}
	/**return true if size is 0, return false if anything else**/
	public boolean isEmpty() {
		return size == 0;
	}
	/**adds an element to the front of the list, using the add between method **/
	public void addFirst (E e) {
		addBetween(e, this.header, this.header.getNext());
	}
	/**adds an element to the end of the list, using the add between method**/
	public void addLast (E e) {
		addBetween(e, this.trailer.getPrev(), this.trailer);
	}
	/**takes in three elements, creates a node with those three elements connecting
	 *  links the the previous node to the new node, links the the next
	 *  node to the new node, increases size by one **/
	public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		this.size++;
	}
	/**if the the list is empty return nothing, otherwise use remove method to
	 * remove the first element**/
	public E removeFirst() {
		if (this.isEmpty()) {
			return null;
		}
		return this.remove(header.getNext());
	}
	/**if the the list is empty return nothing, otherwise use remove method to
	 * remove the last element**/
	public E removeLast() {
		if (this.isEmpty()) {
			return null;
		}
		return this.remove(trailer.getPrev());
	}
	/**takes in a node, sets the node after e to the node before e, and sets the
	 * node before e to the node after e, and minuses the size by one,
	 * and returns the element you removed**/
	public E remove(Node<E> e) {
		e.next.setPrev(e.prev);
		e.prev.setNext(e.next);
		this.size--;
		return e.getElement();
	}
	/**makes a string builder element, creates a new node named walk, while walk
	 * doesn't equal the trailer, add the element to the string builder, if
	 * the next walk doesn't equal trailer add a comma to the string builder, else
	 * set walk equal to the next walk then do it again until walk does equal the
	 * trailer, then break out of the while loop and add ) to the string builder
	 * are return it printing out the list **/
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		Node<E> walk = this.header.next;
		while (walk != this.trailer) {
			sb.append(walk.element);
			if (walk.next != this.trailer)
				sb.append(", ");
			walk = walk.next;
		}
		sb.append(")");
		return sb.toString();
	}

}

