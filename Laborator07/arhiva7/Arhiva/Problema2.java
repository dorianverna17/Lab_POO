import java.util.*;
import java.lang.*;

class LinkedSet extends LinkedList implements Set {

	@Override
	public boolean add(Object obj) {
		if (!this.contains(obj)) {
			super.add(obj);
			return true;
		}
		return false;
	}

	public void add(int i, Object obj) throws IndexOutOfBoundsException{
		if (i <= this.size()) {
			super.add(i, obj);
		}
		else
			throw new IndexOutOfBoundsException();
	}

	public Object set(int i, Object obj) {
		if (i <= this.size()) {
			if (!this.contains(obj)) {
			super.set(i, obj);
			}
		}
		return obj;
	}
}