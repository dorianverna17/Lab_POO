// package lab08;

import java.util.Map;
import java.util.Set;
import java.util.*;
import java.lang.*;

class ArrayMap<K, V> extends AbstractMap<K, V> {
    ArrayList<ArrayMapEntry<K, V>> list;

    public ArrayMap() {
        list = new ArrayList<ArrayMapEntry<K, V>>();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        int i;

        Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
        for (i = 0; i < this.size(); i++) {
            set.add(list.get(i));
        }
        return set;
    }

    public int size() {
        return this.list.size();
    }

    @Override
    public V put(K key, V value) {
        ArrayMapEntry<K, V> obj = new ArrayMapEntry<K, V>(key, value);
        if (!this.list.contains(obj))
            this.list.add(obj);
        return value;
    }

    public class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
        K key;
        V value;

        public ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public V setValue(V value) {
            return this.value = value;
        }

        public String toString() {
            return this.getKey() + " " + this.getValue() + "\r\n";
        }

        public boolean equals(Object o) {
            @SuppressWarnings("unchecked")
            ArrayMapEntry<K, V> obj = (ArrayMapEntry<K, V>)o;
            if (this == obj)
                return true;
            if (this.key == obj.key && this.value == obj.value)
                return true;
            return false;
        }

        public int hashCode() {
            int result = 0;
            
            result += this.key.hashCode();
            result += this.value.hashCode();
            return result;
        }
    }
}

public class Task1 {

    public static void main(String args[]) {
        ArrayMap<Integer, String> map = new ArrayMap<>();

        System.out.println("Populam colectia...");
        map.put(7, "Colectii si genericitate");
        map.put(8, "Clase interne");
        map.put(5, "Fluxuri");

        System.out.println("Verificam...");
        System.out.println("Continutul colectiei: " + map);

        if (map.size() != 3) {
            System.err.println("ArrayMap.size() (" + map.size() + ") a fost implementata gresit.");
        } else {
            System.out.println("OK!");
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        if (entries.size() != 3) {
            System.err.println("ArrayMap.entrySet() a fost implementata gresit.");
        } else {
            System.out.println("OK!");
        }

        for (Map.Entry<Integer, String> e : entries) {
            map.put(e.getKey(), new StringBuffer(e.getValue()).reverse().toString());
            if (!map.entrySet().contains(e)) {
                System.err.println("ArrayMap.put() nu inlocuieste vechea valoare.");
            } else {
                System.out.println("OK!");
            }
            if ((!e.toString().contains(e.getKey().toString()) || (!e.toString().contains(e.getValue())))) {
                System.err.println("ArrayMap.ArrayMapEntry.toString() a fost implementata gresit.");
            } else {
                System.out.println("OK!");
            }
        }

        for (Map.Entry<Integer, String> e1 : entries) {
            for (Map.Entry<Integer, String> e2 : entries) {
                if ((e1 == e2) != (e1.equals(e2))) {
                    System.err.println("ArrayMap.ArrayMapEntry.equals() a fost implementata gresit.");
                } else {
                    System.out.println("OK!");
                }
                if ((e1 == e2) != (e1.hashCode() == e2.hashCode())) {
                    System.err.println("ArrayMap.ArrayMapEntry.hashCode() a fost implementata gresit.");
                } else {
                   System.out.println("OK!");
                }
            }
        }
    }
}
