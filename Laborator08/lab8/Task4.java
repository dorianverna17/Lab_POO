import java.util.*;
import java.lang.*;

class Table<Object> {
    Vector<Vector<Object>> vector;

    public Table(Object[][] vector) {
        this.vector = new Vector<Vector<Object>>(); 
        Vector<Object> aux;
        for (int i = 0; i < vector.length; i++) {
            aux = new Vector<Object>();
            for (int j = 0; j < vector[0].length; j++)
                aux.add(vector[i][j]);
            this.vector.add(aux);
        }
    }

    class AsciiPrinter {
        int[] format;

        public AsciiPrinter(int[] array) {
            this.format = array;
        }
    }

    class CsvPrinter {
        String csv;

        public CsvPrinter() {
            int i, j;
            String aux = "";

            for (i = 0; i < vector.size() - 1; i++) {
                for (j = 0; j < vector.get(0).size() - 1; j++) {
                    aux += vector.get(i).get(j) + ",";
                }
                aux += vector.get(i).get(vector.get(0).size() - 1) + "\r\n";
            }
            for (j = 0; j < vector.get(0).size() - 1; j++) {
                    aux += vector.get(vector.size() - 1).get(j) + ",";
                }
            aux += vector.get(vector.size() - 1).get(vector.get(0).size() - 1);
            this.csv = aux;
        }
    }

    public void print(AsciiPrinter obj) {
        int i, sum;
        String aux = "";

        for (int k = 0; k < vector.size(); k++) {
            aux = "";
            for (i = 0; i < obj.format.length; i++) {
                aux += " ";
                aux += String.format("%s", vector.get(k).get(i));
                sum = 0;
                if (aux.length() < obj.format[i]) {
                    sum = aux.length();
                    // System.out.println(obj.format[i] - sum);   
                    for (int j = 0; j < (obj.format[i] - sum); j++)
                        aux += " ";
                }
                aux += "|";
            }
            System.out.println(aux);
        }
    }

    public void print(CsvPrinter obj) {
        System.out.println(obj.csv);
    }
}

public class Task4 {

    public static void main(String[] args) {
        Object rows[][] = new Object[][] {
                {"#", "Materie", "An", "Semestru", "Credite"},
                {1, "Programarea calculatoarelor", 1, 1, 6},
                {2, "Structuri de date", 1, 2, 6},
                {3, "Programare Orientata pe Obiecte", 2, 1, 6},
        };
        Table t = new Table(rows);
        t.print(t.new CsvPrinter());
        System.out.println();
        t.print(t.new AsciiPrinter(new int[] {2, 32, 8, 8, 8}));
    }
}
