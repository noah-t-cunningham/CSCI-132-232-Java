package lab6_noahCunningham;

public class SinglyLinkedListDemo {
	
	public SinglyLinkedListDemo() {
		
		SinglyLinkedList<String> airports = new SinglyLinkedList<>();
		airports.addFirst("PDX");
		airports.addFirst("SEA");
		airports.addFirst("JFK");
		airports.addFirst("ATL");
		airports.addFirst("ORD");
		airports.addFirst("IAH");
		System.out.println(airports.toString());
		System.out.println(airports.getNth(2));
		airports.addAfter(3, "BZN");
		System.out.println(airports.toString());
		
		SinglyLinkedList<Song> playlist = new SinglyLinkedList<>();
		playlist.addFirst(new Song("Coyotes","Don Edwards"));
		playlist.addFirst(new Song("Ringo","Lorne Green"));
		playlist.addFirst(new Song("The Ride","Edward Allan Coe"));
		System.out.println(playlist.toString());
		System.out.println(playlist.getNth(2));
		playlist.addAfter(2 , new Song(", El Paso","Mart Robbins"));
		System.out.println(playlist.toString());
		
		SinglyLinkedList<String> quote = new SinglyLinkedList<>();
		quote.addFirst("and");
		quote.addFirst("is");
		quote.addAfter(0, "never");
		quote.addAfter(1, "pure");
		quote.addLast("rarely");
		quote.addLast("simple");
		quote.addFirst("the");
		quote.addAfter(0, "truth");
		System.out.println(quote.toString());
	}
	
	
	
	public static void main(String[] args) {
		
		new SinglyLinkedListDemo();
	
	
//		SinglyLinkedList<String> airports = new SinglyLinkedList<>();
//		airports.addFirst("PDX");
//		airports.addFirst("SEA");
//		airports.addFirst("JFK");
//		airports.addFirst("ATL");
//		airports.addFirst("ORD");
//		airports.addFirst("IAH");
//		System.out.println(airports.toString());
//		
//		SinglyLinkedList<Song> playlist = new SinglyLinkedList<>();
//		playlist.addFirst(new Song("Coyotes","Don Edwards"));
//		playlist.addFirst(new Song("Ringo","Lorne Green"));
//		playlist.addFirst(new Song("The Ride","Edward Allan Coe"));
//		System.out.println(playlist.toString());
//		System.out.println("Hello");
		
	}

}
