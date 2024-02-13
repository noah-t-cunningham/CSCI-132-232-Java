package outlab5_noahCunningham;
/** arrayStack class is using the stack interface**/
public class arrayStack<E> implements Stack<E> {
	/**array size capacity, empty list of genertic type, and sets t=-1**/
	public static final int cap = 100;
	private E[] array;
	private int t = -1;
	
	/**creates stack with default cap**/
	public arrayStack() {
		this(cap); 
	}
	/**creates stack with the given cap**/
	public arrayStack(int cap) {
		array = (E[]) new Object[cap]; 
	}
	/**returns the size (t+1)**/
	public int size() {
		return(t+1);
	}
	/**return true when t equals -1, which means the stack is empty**/
	public boolean isEmpty() {
		return (t==-1);
	}
	/****/
	public void push(E e) throws IllegalStateException {
		if(size() == array.length) throw new IllegalStateException("Stack is Full");
		array[++t] = e;
	}
	/**if the stack is empty return nothing, otherwise return the t element in
	 * the array **/
	public E top() {
		if(isEmpty()) {
			return null;
		}
		return array[t];
	}
	/**if the stack is empty return nothing, set answer to the t element in
	 * the array, set t element in the array to nothing, minus t by one, and return
	 *  answer **/
	public E pop() {
		if(isEmpty()) {
			return null;
		}
		E answer = array[t];
		array[t] = null;
		t--;
		return answer;
	}
	/**to string method, creates a string builder, runs a for loop that increment
	 * by -1, if a element in the array doesn't equal null append that value to
	 * sb, then if i doesn't equals 0 put in a comma, otherwise exit for loop, 
	 * append the last bracket and return sb**/
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
			for(int i = array.length-1; i>-1 ; i--) {
				if(array[i]!= null) {
				sb.append(array[i]);
					if(i != 0) {
					sb.append(", ");
					}
				}
			}
			sb.append(")");
			return sb.toString();
		}
}
