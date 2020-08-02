import java.lang.*;
import java.util.*;

class Graph {
	private int nr;
	private MyList adjacent_list[];
	private int visited[];

	public Graph() {
		this(8);
	}

	public Graph(int nr) {
		int i;

		this.visited = new int[nr + 1];
		this.nr = nr;
		adjacent_list = new MyList[nr];
		for (i = 0; i < nr; i++) {
			adjacent_list[i] = new MyList();
			this.visited[i] = 0;
		}
		this.visited[nr] = 0;
	}

	public void add(int x, int y) {
		//if (this.adjacent_list[x - 1].get(y - 1) == null) {
			this.adjacent_list[x - 1].add(y);
		//	return true;
		//}
		//return false;
	}

	public String toString() {
		int i;
		String aux = "";

		for (i = 1; i < nr - 1; i++) {
			aux = aux + this.adjacent_list[i - 1].toString() + "\r\n";
		}
		aux = aux + this.adjacent_list[nr - 2].toString();
		return aux;
	}

	public void dfs(int start) {
		System.out.println(start);
		visited[start] = 1;
		int i;

		// for (i = 0; i < nr; i++) {
		// 	System.out.print(visited[i]);
		// }
		//System.out.println((int)this.adjacent_list[0].get(0));
		if (this.adjacent_list[start - 1] != null)
			for (i = 0; i < nr; i++) {
				//System.out.print(this.adjacent_list[3].get(2));		
				if (this.adjacent_list[start - 1].get(i) != null && visited[(int)this.adjacent_list[start - 1].get(i)] == 0)
					this.dfs((int)this.adjacent_list[start - 1].get(i));
			}
	}
}

public class MyList {
	private Node head;
	private int size;

	public MyList() {
		head = new Node(null);
		size = 0;
	}

	//Adauga un obiect in lista
	public void add(Object data) {
		Node temp = new Node(data);
		Node current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		size++;
	}

	public void add(Object data, int index) {
		Node temp = new Node(data);
		Node current = head;
		for(int i = 0; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		size++;
	}

	public Object get(int index) {
		if(index < 0 || index >= this.size) {
			return null;
		} else {
			Node current = head.getNext();
			for(int i = 0; i < index; i++) {
				if(current.getNext() == null) {
					return null;
				}
				current = current.getNext();
			}
			return current.getData();
		}
	}

	public boolean remove(int index) {
		if(index < 0 || index >= size) {
			return false;
		}
		Node current = head;
		for(int i = 0; i < index; i++) {
			if(current.getNext() == null) {
				return false;
			}
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		size--;
		return true;
	}

	public int size() {
		return size;
	}

	public String toString() {
		Node current = head.getNext();
		String result = "";
		while(current != null) {
			result += "[" + current.getData() + "] ";
			current = current.getNext();
		}
		return result;
	}

	
	private class Node {
		private Node next;
		private Object data;

		public Node(Object data) {
			this.next = null;
			this.data = data;
		}

		public Node(Object data, Node next) {
			this.next = next;
			this.data = data;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
