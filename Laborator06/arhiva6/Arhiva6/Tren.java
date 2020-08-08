package Lab06;

import java.util.*;
import java.lang.*;

public class Tren {
	Vector<Vagon> vector;

	public Tren() {
		this.vector = new Vector<Vagon>();
	}

	public void addVagon(Vagon vagon) {
		this.vector.add(vagon);
	}

	public String toString() {
		String aux = "";
		int i;

		for (i = 0; i < this.vector.size(); i++) {
			aux = aux + this.vector.get(i).name + "\r\n";
		}
		return aux;
	}

	public int getCapacity() {
		int i, capacity = 0;

		for (i = 0; i < this.vector.size(); i++) {
			capacity = capacity + this.vector.get(i).colete;
		}
		return capacity;
	}

	public boolean toCompare(Object o) {
		Tren obj = (Tren) o;
		if (this.getCapacity() == obj.getCapacity())
			return true;
		return false;
	}
}