import java.util.*;
import java.lang.*;

class Graph {
	private int matrix[][];
	private final static int Infinit = 9500;
	private int n;

	public Graph(int nr) {
		int i, j;

		this.matrix = new int[nr][nr];
		this.n = nr;
		for (i = 0; i < nr; i++)
			for (j = 0; j < nr; j++)
				this.matrix[i][j] = 0;
	}

	public int getSize() {
		return n;
	}

	public void addArc(int v, int w, int cost) {
		this.matrix[v - 1][w - 1] = cost;
	}

	public boolean isArc(int v, int w) {
		if (this.matrix[v][w] != 0)
			return true;
		return false;
	}

	public String toString() {
		String aux = "";

		for (int i = 0; i < this.getSize(); i++) {
			aux = aux + (i + 1);
			for (int j = 0; j < this.getSize(); j++)
				if (this.matrix[i][j] != 0)
					aux = aux + "--(" + this.matrix[i][j] +")-->" + (j + 1);
			aux = aux + "\r\n";
		}
		return aux;
	}

	public int[][] floydWarshall() {
		int result[][];
		
		result = new int[n][n];
		
		int k, i, j;
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(i == j) {
					result[i][j] = 0;
				} else if(isArc(i, j)) {
					result[i][j] = matrix[i][j];
				} else {
					result[i][j] = Infinit;
				}
			}
		}
		for(k = 0; k < n; k++) {
			for(i = 0; i < n; i++) {
				for(j = 0; j < n; j++) {
					int dist;
					dist = result[i][k] + result[k][j];
					if(result[i][j] > dist) {
						result[i][j] = dist;
					}
				}
			}
		}
		return result;
	}

	public static void main(String args[]) {
		Graph g = new Graph(4);
		g.addArc(1, 3, 2);
		g.addArc(1, 2, 3);
		g.addArc(2, 4, 6);
		g.addArc(2, 3, 2);
		System.out.println(g);
		System.out.println("Floyd-Warshall");
		int [][] my_matrix = g.floydWarshall();
		System.out.println("distanta minima dintre nodurile 1 si 4 este "+ my_matrix[0][3]); // rezultat - 9
	}
}