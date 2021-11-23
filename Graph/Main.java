import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please insert number of vertices in the graph");
		int v = input.nextInt();
		// initialising graph with v vertices
		MyGraph g = new MyGraph(v); 
		// reading input elements for adjacency matrix[v][v]
		System.out.println("please insert elements in the matrix" + "[" + v + "]" + "[" + v + "]");
		for (int i = 0; i < v; i++)	{
			System.out.println("please insert elements in row index: " + i);
			for (int j = 0; j < v; j++) {
				g.matrix[i][j] = input.nextInt();
			}
		}
		System.out.println("The input Adjacency Matrix:");
		g.displayMatrix(); // print adjacency matrix	
		g.matrixToList(g.matrix); // converting adjacency matrix into adjacency array
		System.out.println("Adjacency Array for the input Adjacency Matrix:");
		g.displayAdjListArray(); // printing adjacency array		
		
	}
}