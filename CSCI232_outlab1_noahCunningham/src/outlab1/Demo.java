package outlab1;

import java.util.Random;
import java.util.Arrays;

public class Demo {
public static void main(String[] args) {
	
//System.out.println("hi");
	
	/**instantiate variables i need**/
	BubbleSort BS = new BubbleSort();
	CocktailSort CS = new CocktailSort();
	RadixSort RS = new RadixSort();
	Random rando = new Random();
	int[] Array = new int[100000];
	int[] BubbleArray = new int[100000];
	int[] CocktailArray = new int[100000];
	int[] RadixArray = new int[100000];
	/**create array with random generated numbers**/
	for(int i = 0;i<100000; i++) {
		Array[i]=rando.nextInt(500000-1+1)+1;
		}
	/**Copy random array to 3 other arrays**/
	for(int i = 0;i<100000; i++) {
		BubbleArray[i]=Array[i];
		CocktailArray[i]=Array[i];
		RadixArray[i]=Array[i];
		//System.out.println(Array[i]);
		//System.out.println(BubbleArray[i]);
		}
	int[] ta = {9,2,9,6,5,8,1,4,7,124,4592,26,94,362929,387686482,7,7};
	BS.sort(ta);
	System.out.println("Im printing out a test array because my computer couldent print 300,000 numbers all at once with each sorting algorithims elapsed time");
	System.out.println("Bubble Sort "+Arrays.toString(ta));
	CS.sort(ta);
	System.out.println("Cocktail Sort "+Arrays.toString(ta));
	RS.sort(ta);
	System.out.println("Radix Sort "+Arrays.toString(ta));
	System.out.println("These are the sorting times for the lists with 100,000 numbers in it");
	Stopwatch BSSW = new Stopwatch();
	BS.sort(BubbleArray);
	System.out.println("Bubble Sort Elapsed Time "+ BSSW.elapsedTime());
	Stopwatch CSSW = new Stopwatch();
	CS.sort(CocktailArray);
	System.out.println("Cocktail Sort Elapsed Time "+CSSW.elapsedTime());
	Stopwatch RSSW = new Stopwatch();
	RS.sort(RadixArray);
	System.out.println("Radix Sort Elapsed Time "+RSSW.elapsedTime());
//	System.out.println(Arrays.toString(BubbleArray));
//	System.out.println(Arrays.toString(CocktailArray));
//	System.out.println(Arrays.toString(RadixArray));
	
//System.out.println("by");
	}
}
