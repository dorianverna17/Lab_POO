import java.util.*;

class Test {
    static String str1 = "text";
    static String str2 = new String("text");
    static char data[] = {'t', 'e', 'x', 't'};
    static String str3 = new String(data);
    public static void main(String args[]) {
    	System.out.println(str1);
    	System.out.println(str2);
    	System.out.println(str3);

    	String x = "a" + 1 + "b";
		System.out.println(x);        
        x = 1 + 2 + "c" + 1 + 2;
        System.out.println(x);
        x = "" + 1 + 2 + "c";
        System.out.println(x);
        x = 1.5 + " " + 2.3;
        System.out.println(x);

        StringBuffer str = new StringBuffer("abc");
        StringBuffer str1 = new StringBuffer();
        //se adauga str la sbuf
        str1.append(str);
        System.out.println("str1 = " + str1);
        //se adauga reprezentarea ca sir de caractere a nr 2
        str1.append(1);
        str1.append("xyz");
        //se insereaza sirul "bc" in str1
        str1.append("abc", 1, 3);
        System.out.println(str1);
        //se inlocuiesc caracterele de la pozitiile 1-3
        //cu sirul s => aPOO1xyzbc
        String s = "POO";
        str1.replace(1, 3, s);
        System.out.println(str1);
        //se sterg caracterele de la pozitiile 1-3
        str1.delete(1, 3);
        System.out.println(str1);


        //Instantierea obiectului
        Vector<Integer> vect = new Vector<>();
 
        //Adaugarea in vector a unor numere intregi
        vect.add(20);
        vect.add(5);
        vect.add(7);
 
        //Determinarea pozitie lui 5
        System.out.println(vect.indexOf(5));
 
        //Determinarea primului element
        System.out.println(vect.firstElement());
 
        //Modificarea elementului de pe pozitia 2
        vect.set(2, 10);
 
        //Determinarea primului element
        int first = (int) vect.get(0);
 
        //Afisarea vectorului - recomandat
        System.out.println(vect);
        //Afisarea vectorului - **NERECOMANDAT** !!
        for(int i = 0 ; i < vect.size(); i++) {
            System.out.println(vect.get(i));
        }
		}
}