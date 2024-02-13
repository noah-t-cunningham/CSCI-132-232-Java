package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws FileNotFoundException {
		
		File Commy = new File ("manifesto.txt");
		File reals = new File ("reals.txt");
		CocktailSort CS = new CocktailSort();
		String[] array;
		ArrayList<Comparable> Stache = Read(Commy);
		ArrayList<Comparable> little = Read(reals);
		//System.out.println(Stache);
//		for(Comparable i:Stache ) {
//			System.out.println(i);
//		}
		Comparable BigStache[] = new Comparable[Stache.size()];
		BigStache = Stache.toArray(BigStache);
		Comparable Biglittle[] = new Comparable[little.size()];
		Biglittle = little.toArray(Biglittle);
		CS.sort(BigStache);
		CS.sort(Biglittle);
		
		for(Comparable i:BigStache ) {
		System.out.println(i);
	}
		for(Comparable j:Biglittle) {
		System.out.println(j);
	}
		//System.out.println(Arrays.toString(Biglittle));
	}
	public static ArrayList<Comparable> Read(File f) throws FileNotFoundException{
		ArrayList<Comparable> MotherLand = new ArrayList<>();
		try(Scanner scan = new Scanner(f)){
			 while (scan.hasNextLine()) {
				 String line = scan.nextLine();
			        Scanner scan2 = new Scanner(line);
			        while(scan2.hasNext()) {
			       //System.out.println(scan2.next()));
			       MotherLand.add(scan2.next());
			        }
			 }
			 return MotherLand;
		}
	}
}
