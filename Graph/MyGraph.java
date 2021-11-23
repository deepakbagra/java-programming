import java.util.*;
public class MyGraph {
	LinkedList[] adjListArray; // initialising an array of adjacency list
	public int[][] matrix; // initialising a 2D adjacency matrix
	public int v; // number of vertices	

	// basic constrcutor to create a blank Graph
	public MyGraph() {
		this.v = 0;		
	}
	// parameterised constrcutor 
	public MyGraph(int v) {
		this.v = v;
		// create adjacency matrixToList
		this.matrix = new int[v][v];
		// create adjacency array of size with number of vertices 
		this.adjListArray = new LinkedList[v];		
		// initialise each element of adjacency array with null value
		for (int i = 0; i < v; i++) {
			this.adjListArray[i] = new LinkedList();
		}
		
	}
	// transform an adjacency matrix to an adjacency list
	public void matrixToList(int[][] matrix) {
		this.v = matrix[0].length; // number of vertices is equal to the matrix length
        for (int i = 0; i < this.v; i++) { 
            for (int j = 0; j < this.v; j++) { 
                if (matrix[i][j] == 1) {                	 
                    adjListArray[i].add(j); 
                } 
            } 
        }        
	}
	// Print out the adjacency list array
	public void displayAdjListArray() {
		for (int i = 0; i < this.v; i++) {
			System.out.print(i + ": ");
			this.adjListArray[i].print();
		}	
	}
	// Print adjacency matrix
	public void displayMatrix() {
		System.out.print("     ");
		for (int i = 0; i < this.v; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < this.v; i++) {
			System.out.print(i + " |  ");
			for (int j = 0; j < this.v; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}



	
