import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Problema2 extends JFrame implements ActionListener {
	private JRadioButton button1;
	private JRadioButton button2;
	private JRadioButton button3;
	private JRadioButton button4;
	private ButtonGroup group;
	private JTextField field;
	private JButton button;

	public Problema2(String text) throws FileNotFoundException {
        super(text);
        try {
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	setMinimumSize(new Dimension(500, 500));
        	getContentPane().setBackground(Color.blue);
        	setLayout(new FlowLayout());
      		
      		File file = new File("intrebare.txt");
        	Scanner sc = new Scanner(file);
    	
    		field = new JTextField();
        	field.setText(sc.nextLine());
        	field.setEditable(false);
        	add(field);

        	button1 = new JRadioButton(sc.nextLine());
        	button2 = new JRadioButton(sc.nextLine());
        	button3 = new JRadioButton(sc.nextLine());
        	button4 = new JRadioButton(sc.nextLine());
        	add(button1);
        	add(button2);
        	add(button3);
        	add(button4);
        	button = new JButton ("Valideaza");
        	button.addActionListener(this);
        	button.setEnabled(false);
        	add(button);

        	group = new ButtonGroup();
        	group.add(button1);
        	group.add(button2);
        	group.add(button3);
        	group.add(button4);

        	button1.addActionListener(this);
        	button2.addActionListener(this);
        	button3.addActionListener(this);
        	button4.addActionListener(this);

        	show();
        	pack();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}

	@Override
    public void actionPerformed(ActionEvent e){
    	button1.setForeground(Color.BLACK);
    	button2.setForeground(Color.BLACK);
    	button3.setForeground(Color.BLACK);
    	button4.setForeground(Color.BLACK);
        if (e.getSource() instanceof JButton) {
    		JButton button = (JButton)e.getSource();
    		if (button.getText().equals("Valideaza")) {
    			if (group.getSelection().equals(button1.getModel())) {
    				button1.setForeground(Color.GREEN);
    			} else {
    				if (group.getSelection().equals(button2.getModel()))
    					button2.setForeground(Color.RED);
    				if (group.getSelection().equals(button3.getModel()))
    					button3.setForeground(Color.RED);
    				if (group.getSelection().equals(button4.getModel()))
    					button4.setForeground(Color.RED);
    			}
    		}
    	} else {
    		if (group.getSelection().equals(button1.getModel()) ||
    			group.getSelection().equals(button2.getModel()) ||
    			group.getSelection().equals(button3.getModel()) ||
    			group.getSelection().equals(button4.getModel()))
    			button.setEnabled(true);
    	}
    }

	public static void main(String args[]) throws FileNotFoundException {
		Problema2 fereastra = new Problema2("Problema2");
	}
}