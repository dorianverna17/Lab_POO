import java.lang.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Problema5 extends JFrame implements ActionListener{
    private JButton button;
    private Vector<Color> vector;

    public Problema5(String text_string) {
        super(text_string);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(100, 100));
        frame.getContentPane().setBackground(Color.yellow);
        frame.setLayout(new FlowLayout());

        button = new JButton("Colors");
        frame.add(button);

        vector = new Vector<Color>();
        vector.add(Color.GREEN);
        vector.add(Color.BLACK);
        vector.add(Color.RED);
        vector.add(Color.YELLOW);
        vector.add(Color.BLUE);
        vector.add(Color.GRAY);

        button.addActionListener(this);

        frame.show();
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() instanceof JButton) {
    		JButton but = (JButton)e.getSource();
    		Color col = but.getBackground();
   			int i = vector.indexOf(col);
   			if (i == -1) {
   				i = 0;
   				but.setBackground(vector.get(i));
   				return;
   			}
    		if (i == vector.size() - 1) {
    			i = 0;
    			but.setBackground(vector.get(i));	
    			return;
    		}
    		but.setBackground(vector.get(i + 1));
    	}
    }

	public static void main(String args[]) throws FileNotFoundException {
		Problema5 fereastra = new Problema5("Problema2");
	}
}