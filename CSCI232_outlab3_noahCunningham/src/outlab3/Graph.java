/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * taken from Algorithms, 4th edition by Sedgewick and Wayne
 */
package outlab3;

import java.io.BufferedReader;

/******************************************************************************
 *  Compilation:  javac Graph.java        
 *  Execution:    java Graph input.txt
 *  Dependencies: Bag.java Stack.java In.java StdOut.java
 *  Data files:   https://algs4.cs.princeton.edu/41graph/tinyG.txt
 *                https://algs4.cs.princeton.edu/41graph/mediumG.txt
 *                https://algs4.cs.princeton.edu/41graph/largeG.txt
 *
 *  A graph, implemented using an array of sets.
 *  Parallel edges and self-loops allowed.
 *
 *  % java Graph tinyG.txt
 *  13 vertices, 13 edges 
 *  0: 6 2 1 5 
 *  1: 0 
 *  2: 0 
 *  3: 5 4 
 *  4: 5 6 3 
 *  5: 3 4 0 
 *  6: 0 4 
 *  7: 8 
 *  8: 7 
 *  9: 11 10 12 
 *  10: 9 
 *  11: 9 12 
 *  12: 11 9 
 *
 *  % java Graph mediumG.txt
 *  250 vertices, 1273 edges 
 *  0: 225 222 211 209 204 202 191 176 163 160 149 114 97 80 68 59 58 49 44 24 15 
 *  1: 220 203 200 194 189 164 150 130 107 72 
 *  2: 141 110 108 86 79 51 42 18 14 
 *  ...
 *  
 ******************************************************************************/


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 *  The {@code Graph} class represents an undirected graph of vertices
 *  named 0 through <em>V</em> – 1.
 *  It supports the following two primary operations: add an edge to the graph,
 *  iterate over all of the vertices adjacent to a vertex. It also provides
 *  methods for returning the number of vertices <em>V</em> and the number
 *  of edges <em>E</em>. Parallel edges and self-loops are permitted.
 *  By convention, a self-loop <em>v</em>-<em>v</em> appears in the
 *  adjacency list of <em>v</em> twice and contributes two to the degree
 *  of <em>v</em>.
 *  <p>
 *  This implementation uses an adjacency-lists representation, which 
 *  is a vertex-indexed array of {@link Bag} objects.
 *  All operations take constant time (in the worst case) except
 *  iterating over the vertices adjacent to a given vertex, which takes
 *  time proportional to the number of such vertices.
 *  <p>
 *  For additional documentation, see <a href="https://algs4.cs.princeton.edu/41graph">Section 4.1</a>
 *  of <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final String V;
    private final int numV;
    private int E;
    private Bag<String>[] adj;
    
    //graph class that is compatible with how i inputted the data
    public Graph(String[] classes, String[] teachers) {
    	//set variables
    	this.numV  = classes.length;
        this.V = "";
		this.E = 0;
		// set bag = to new bag woth numV length
		adj = (Bag<String>[]) new Bag[numV];
		//for loop that builds the vertices of the graph
		 for (int v = 0; v < numV; v++) {
	            adj[v] = new Bag<String>();
	            adj[v].add(classes[v]);
		 }
		 //nested for loop that adds edges to classes that have the same teacher
		 for (int i = 0; i < numV; i++) {
	            for (int j = i+1; j < numV; j++) {
	            	if(teachers[i].equals(teachers[j])) {
	            		addEdge(classes, i, j);
	            	}
	            }
	        }
		 
		 
    }
 

    /**
     * Returns the number of vertices in this graph.
     *
     * @return the number of vertices in this graph
     */
    public String V() {
        return V;
    }
 
    public int numV() {
		return numV;
    	
    }

    /**
     * Returns the number of edges in this graph.
     *
     * @return the number of edges in this graph
     */
    public int E() {
        return E;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        if (v < 0 || v >= numV)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (numV-1));
    }

    /**
     * Adds the undirected edge v-w to this graph.
     *
     * @param  v one vertex in the edge
     * @param  w the other vertex in the edge
     * @throws IllegalArgumentException unless both {@code 0 <= v < V} and {@code 0 <= w < V}
     */
    
    //edited add edges to be compatible with string vertices
    public void addEdge(String[] classes, int v, int w) {
        validateVertex(v);
        validateVertex(w);
        E++;
        adj[v].add(classes[w]);
        adj[w].add(classes[v]);
    }


    /**
     * Returns a string representation of this graph.
     *
     * @return the number of vertices <em>V</em>, followed by the number of edges <em>E</em>,
     *         followed by the <em>V</em> adjacency lists
     */
    
    //edited to string to print out in correct format
    public String toString(String[] classes,String[] teachers) {
        StringBuilder s = new StringBuilder();
        s.append(numV + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < numV; v++) {
            s.append(classes[v] + ", "+teachers[v]);
            if(adj[v].size()==1) {
            	 s.append(" teaches only this class");
            	 s.append(NEWLINE); 
            } 
            else {
            	s.append(" also teaches ");
    		for (String w : adj[v]) {
    			//use this to ensure it doesnt print the verticy class as an also teaches class
    			if(!w.equals(classes[v])){
    			s.append(w + " ");
    			}
    		}
             s.append(NEWLINE); 
            }
        }
        return s.toString();
    }
    
    /**
     * Unit tests the {@code Graph} data type.
     *
     * @param args the command-line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
    	//create variables i need
    	File file = new File("classes_pgm3.csv");
        int i = 0;
        BufferedReader literate =  new BufferedReader(new FileReader(file));
        String[] classes = new String[23];
        String[] teachers = new String[23];
        Store sT;
        String line;
        //read through the csv file and store info in store class and put teachers and classes into a list
		while((line = literate.readLine())!= null) {
        sT = new Store(line);
        classes[i]=sT.getClassID();
        teachers[i]=sT.getTeacher();
        i++;
        }
       
        Graph G = new Graph(classes, teachers);
        
        System.out.println(G.toString(classes, teachers));

    }
}




