import java.util.*;
import java.lang.*;

class Lista {
   List list1;
   List list2;

   public Lista() {
      this.list1 = new ArrayList ();
      this.list2 = new LinkedList ();
   }

   public static void main(String asrgs[]) {
      Lista obj = new Lista();
      obj.list1.add("Lab POO");
      obj.list1.add("Colectii");
      obj.list1.add("Structuri de date");
      if (obj.list1.contains("Colectii")) {
         System.out.println("Lista contine cuvantul");
      }
      int index = 0;
      System.out.println(obj.list1);
      while(!obj.list1.isEmpty()) {
         System.out.println(obj.list1.get(index));
         obj.list1.remove(index);
      }
      obj.list2.add(1);
      obj.list2.add(10);
      obj.list2.add(20);
      Vector v = new Vector();
      v.add(50);
      v.add(17);
      obj.list2.addAll(v);
      for(Object i : obj.list2) {
         System.out.println(i);
      }

      Collections.sort(obj.list2);
      System.out.println(obj.list2);
      System.out.println(obj.list1);
   }
}