import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

class Fereastra extends JFrame {
    private JButton button;
 
    public Fereastra (String text){
        super(text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension (300, 200));
        getContentPane().setBackground (Color.blue);
        setLayout(new SpringLayout());
        button = new JButton("Apasa");
        add(button);
        show();
        pack();
   }
 
    public static void main(String args[]) {
        Fereastra f = new Fereastra("Laborator POO" ) ;
    }
}