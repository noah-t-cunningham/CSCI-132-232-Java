package lab2;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Taken from Algorithms, 4th edition - by Robert Sedgewick and Kevin Wayne 
 */

/******************************************************************************
 *  
 *  Data files:   
 *  A program with cubic running time. Reads n integers
 *  and counts the number of triples that sum to exactly 0
 *  (ignoring integer overflow).
 * % java ThreeSum 8ints.txt
 * 4
 *  
 * % java ThreeSum 1Kints.txt 
 *  70
 *
 *  % java ThreeSum 2Kints.txt 
 *  528
 *
 *  % java ThreeSum 4Kints.txt 
 *  4039
 *
 ******************************************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
//import csci232library.StopWatch;
//import csci232library.StopWatchCPU;

/**
 *
 * @author k57h721
 */
public class FourSum {

 
    /**
     * Returns the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param  a the array of integers
     * @return the number of triples (i, j, k) with {@code i < j < k}
     *         such that {@code a[i] + a[j] + a[k] == 0}
     */
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                	for(int x = k+1; x<n;x++) {
                    if (a[i] + a[j] + a[k] + a[x] == 0) {
                    	System.out.println(count);
                        count++;
                    	}
                    }
                }
            }
        }
        return count;
    } 
    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  { 
        Random rando = new Random();
        int [] a = new int[1000];
        for(int i = 0; i < a.length; i++) {
        	//a[i]=rando.nextInt(2000+2000)-2000;
        	a[i]=rando.nextInt(7999)+1;
        	System.out.println(a[i]);
        	System.out.println(i); 
        }
        StopWatch timer = new StopWatch();
        int count = count(a);
        System.out.println("Elapsed time = " + timer.elapsedTime());
        System.out.println(count);
    } 
} 
// THE BIG O IS 0(N^4)
