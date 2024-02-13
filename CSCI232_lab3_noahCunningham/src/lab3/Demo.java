package lab3;

import java.util.Random;


public class Demo {
public static void Main(String args[]) {
	Random rando = new Random();
	int list[] = new int[5000];
	
	for(int i = 0; i<5000; i++) {
		list[i] = rando.nextInt(4999)+1;
		}
	}
}
