import java.util.*;
import java.lang.*;

class MyQueue {
    private MyArray arr;
    private final static int Infinit = 9500;
    private int firstIndex;
    private int lastIndex;
    private int size;

    public MyQueue() {
        arr = new MyArray(Infinit);
        this.size = this.arr.getSize();
    }

    public int getSize() {
        return this.size;
    }

    public void enqueue(int value) {
        if (this.size == 0) {
            this.firstIndex = 0;
            this.lastIndex = 0;
            arr.set(0, value);
            this.size++;
        } else {
            this.lastIndex++;
            arr.set(this.lastIndex, value);
            this.size++;
        }
    }

    public int dequeue() {
        if (this.size == 0)
            System.out.println("Coada este goala");
        else {
            this.size--;
            this.firstIndex++;
            return arr.get(firstIndex - 1);
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.size == 0)
            return true;
        else return false;
    }

    public String toString() {
        int i;
        String aux = "";
        if (size != 0) {
            for (i = this.firstIndex; i < this.lastIndex; i++)
                aux = aux + arr.get(i) + " ";
            aux = aux + arr.get(this.lastIndex);
        }
        return aux;
    }
}

class MyArray {
    private int v[];
    private int size;
 
    public MyArray() {
        this(100);
    }
 
    public MyArray(int length) {
        size = 0;
        v = new int[length];
    }
 
    public int get(int poz) {
        if(poz < size) {
            return v[poz];
        } else {
            return -1;
        }
    }
 
    public void set(int pos, int value) {
        v[pos] = value;
        size++;
    }
 
    public int getSize() {
        return size;
    }
}
 
 
class Test {
    public static void main(String args[]) {
        MyQueue queue = new MyQueue();
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(-1);
        queue.enqueue(2);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        System.out.println(queue);
        queue.enqueue(9);
        queue.enqueue(queue.dequeue());
        queue.enqueue(11);
        queue.enqueue(22);
        System.out.println(queue);
        while(!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println("");
        System.out.println(queue);
    }
}