package lab7_noahCunningham;

import java.util.Random;

public class PrefixAverages {
	
	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage1 (double[] x) {
		int n = x.length;
		double[] a = new double[n];
		for (int j = 0; j < n; j++) {
			double total = 0;
			for (int i = 0; i <= j; i++)
				total += x[i];
			a[j] = total / (j + 1);

		}
		return a;
	}
	
	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	public static double[] prefixAverage2(double[] x) {
		int n = x.length;
		double[] a = new double[n];
		double total = 0;
		for (int j = 0; j < n; j++) {
			total += x[j];
			a[j] = total / (j + 1);
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		long Starttime;
		long Endtime;
		double[] numList = new double[10];
		double[] numList2 = new double[100];
		double[] numList3 = new double[1000];
		double[] numList4 = new double[10000];
		double[] numList5 = new double[100000];
		
		
		for(int i = 0; i < 10; i++) {
			numList[i]= rand.nextInt(100);
		}
		for(int j = 0;  j< 100; j++) {
			numList2[j]= rand.nextInt(100);
		}
		for(int k = 0; k < 1000; k++) {
			numList3[k]= rand.nextInt(100);
		}
		for(int q = 0; q < 10000; q++) {
			numList4[q]= rand.nextInt(100);
		}
		for(int z = 0; z < 100000; z++) {
			numList5[z]= rand.nextInt(100);
		}
		
		
		Starttime = System.nanoTime();
		prefixAverage1(numList);
		Endtime = System.nanoTime();
		long totaltime = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage1(numList2);
		Endtime = System.nanoTime();
		long totaltime2 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage1(numList3);
		Endtime = System.nanoTime();
		long totaltime3 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage1(numList4);
		Endtime = System.nanoTime();
		long totaltime4 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage1(numList5);
		Endtime = System.nanoTime();
		long totaltime5 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage2(numList);
		Endtime = System.nanoTime();
		long totaltime6 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage2(numList2);
		Endtime = System.nanoTime();
		long totaltime7 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage2(numList3);
		Endtime = System.nanoTime();
		long totaltime8 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage2(numList4);
		Endtime = System.nanoTime();
		long totaltime9 = Endtime-Starttime;
		
		Starttime = System.nanoTime();
		prefixAverage2(numList5);
		Endtime = System.nanoTime();
		long totaltime10 = Endtime-Starttime;
		
		
		
		
		System.out.println("n = 10  	algl1 time: " + totaltime + "ns.");
		System.out.println("n = 100 	algl1 time: " + totaltime2 + "ns.");
		System.out.println("n = 1000	algl1 time: " + totaltime3 + "ns.");
		System.out.println("n = 10000	algl1 time: " + totaltime4 + "ns.");
		System.out.println("n = 100000	algl1 time: " + totaltime5+ "ns.");
		System.out.println("n = 10   	algl2 time: " + totaltime6 + "ns.");
		System.out.println("n = 100 	algl2 time: " + totaltime7 + "ns.");
		System.out.println("n = 1000	algl2 time: " + totaltime8 + "ns.");
		System.out.println("n = 10000	algl2 time: " + totaltime9 + "ns.");
		System.out.println("n = 100000	algl2 time: " + totaltime10 + "ns.");
		

		
	}

	
}
