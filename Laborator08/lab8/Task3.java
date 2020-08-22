// package lab08;

import java.util.Iterator;
import java.util.*;
import java.lang.*;

class LinkedList<T> implements Iterable<T> {
    Node<T> first;
    Node<T> last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    class ListIterator<T> implements Iterator<T> {
        Node<T> node;

        public ListIterator(LinkedList<T> list) {
            this.node = list.first;
        }

        public boolean hasNext() {
            if (this.node == null)
                return false;
            return true;
        }

        public T next() {
            T value;
            value = this.node.value;
            this.node = node.next;
            return value;
        }

    }

    //Insereaza un nod la inceputul listei
    public void addFirst(T data) {
        Node<T> new_node = new Node<T>(data, this.first);
        this.first = new_node;
    }
    //Insereaza un nod la sfarsitul listei
    public void add(T data) {
        Node<T> new_node = new Node<T>(data);
        if (this.last == null && this.first == null) {
            this.first = new_node;
            this.last = new_node;
            this.last.next = null;
        } else {
            this.last.next = new_node;
            this.last = new_node;
            this.last.next = null;
        }
    }
    //Returneaza primul nod din lista
    public T getNode() {
        return this.first.value;
    }
    //Returneaza un obiect de tip ListIterator
    public Iterator<T> iterator() {
        Iterator<T> it = new ListIterator<T>(this);
        return it;
    }    
}

public class Task3 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // System.out.println("da");
        list.add(10);
        // System.out.println("da");
        list.add(20);
        // System.out.println("da");
        list.addFirst(5);
        // System.out.println("da");
        list.add(22);
        // System.out.println("da");
        list.add(25);
        // System.out.println("da");
        list.add(30);
        // System.out.println("da");

        // System.out.println(list.first.next.next.next.next.next.next.value);
        int last = 0;
        System.out.println("Afisare 1");
        for (Integer i : list) {
            System.out.print(i + ", ");
            if (i < last) {
                System.err.println("LinkedList a fost implementata gresit.");
            }
            last = i;
        }
        System.out.println();

        System.out.println("Afisare 2");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
    }
}