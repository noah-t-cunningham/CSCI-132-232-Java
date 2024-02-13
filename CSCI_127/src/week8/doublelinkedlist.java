package week8;

public class doublelinkedlist<E> {

	private static class Node<E>{
		private E element;
		private Node<E> next;
		private Node<E> prev;
	
	
	
		public Node(E e, Node<E> p, Node<E> n) {
			this.element = e;
			this.prev = p;
			this.next = n;
			}
		public E getElement( ) {return element;}
		public Node<E> getPrev(){return prev;}
		public Node<E> getNext(){return next;}
		public void setPrev(Node<E> p) {prev = p;}
		public void setNext(Node<E> n) {prev = n;}
	}
	
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	
	public doublelinkedlist() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(this.trailer);
	}
	
	public int size() {return size;}
	public boolean isEmpty() {return size == 0;}
	public E first() {
		if (isEmpty()) return null;
			return header.getNext().getElement();
	}
	
	public E last() {
		if (isEmpty()) return null;
			return trailer.getPrev().getElement();
	}
	
}
