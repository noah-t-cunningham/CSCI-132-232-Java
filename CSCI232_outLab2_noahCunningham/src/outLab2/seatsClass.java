package outLab2;
import java.util.ArrayList;

import outLab2.BinarySearchTree.Node;

public class seatsClass{
	int chairs;
	public seatsClass(int sect, int seats) {
		/**if there is more than 1 section i need to manipulate the
		 * seats. And since there are only 2 lectures with more
		 * than 1 section and they both happen to have 5 sections 
		 * with the same amount of seats i multiply seats by 5 when there 
		 * is more than 1 sections to get the correct values**/
		if(sect>1) {
			chairs = seats*5; 	
		}
		else {
			chairs = seats;
		}
	}
	
	public int getChairs(){
		return chairs;
		
	}
}
