package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k57h721
 */
public class HeapSort {


    // This class should not be instantiated.
    private HeapSort() { }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param pq the array to be sorted
     */
    public static void sort(Comparable[] pq) {
        
        int n = pq.length;
        for (int k = n/2; k >= 1; k--) {
        	//System.out.println(k+" "+n);
            sink(pq, k, n);
            show(pq);
        }
        
        while (n > 1) {
            exch(pq, 1, n--);
            sink(pq, 1, n);
            show(pq);
        }
        
    }

   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/

    private static void sink(Comparable[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(pq, j, j+1)) {
            	//System.out.println("j++");
            	j++;
            }
            if (!less(pq, k, j)) {
            	//System.out.println("break");
            	break;
            }
            //System.out.println(k+" exch "+j);
            exch(pq, k, j);
            k = j;
        }
    }

   /***************************************************************************
    * Helper functions for comparisons and swaps.
    * Indices are "off-by-one" to support 1-based indexing.
    ***************************************************************************/
    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i-1].compareTo(pq[j-1]) < 0;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = swap;
    }
    
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
     
    	Comparable list2[] = {"D","J","E","B","A","F","G","C","H","I"};
    	sort(list2);
    	show(list2);
        
        
    }    
}
