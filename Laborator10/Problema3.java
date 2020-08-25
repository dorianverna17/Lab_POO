import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Problema3 extends JFrame implements ActionListener{
	private JCheckBox button1;
	private JCheckBox button2;
	private JCheckBox button3;
	private JCheckBox button4;
	private JTextField field;
	private JButton button;

	public Problema3(String text) throws FileNotFoundException {
        super(text);
        try {
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	setMinimumSize(new Dimension(500, 500));
        	getContentPane().setBackground(Color.blue);
        	setLayout(new FlowLayout());
      		
      		File file = new File("intrebare1.txt");
        	Scanner sc = new Scanner(file);
    	
    		field = new JTextField();
        	field.setText(sc.nextLine());
        	field.setEditable(false);
        	add(field);

        	button1 = new JCheckBox(sc.nextLine());
        	button2 = new JCheckBox(sc.nextLine());
        	button3 = new JCheckBox(sc.nextLine());
        	button4 = new JCheckBox(sc.nextLine());
        	add(button1);
        	add(button2);
        	add(button3);
        	add(button4);
        	button = new JButton ("Valideaza");
        	button.addActionListener(this);
        	button.setEnabled(false);
        	add(button);

            ItemListener item1 = new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent item) {
                    JCheckBox abstractButton = (JCheckBox)item.getSource();
                    Color foreground = abstractButton.getForeground();
                    Color background = abstractButton.getBackground();
                    int state = item.getStateChange();
                    if (state == ItemEvent.SELECTED) {
                        abstractButton.setForeground(Color.WHITE);
                        abstractButton.setBackground(Color.BLACK);
                        button.setEnabled(true);
                    } else {
                        abstractButton.setForeground(Color.BLACK);
                        abstractButton.setBackground(Color.WHITE);
                    }
                    if (!button1.isSelected() && !button2.isSelected() &&
                        !button3.isSelected() && !button4.isSelected())
                        button.setEnabled(false);
                }
            };
        	button1.addItemListener(item1);
        	button2.addItemListener(item1);
        	button3.addItemListener(item1);
        	button4.addItemListener(item1);

        	show();
        	pack();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}

	@Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() instanceof JButton) {
    		JButton button = (JButton)e.getSource();
    		if (button.getText().equals("Valideaza")) {
                if (button2.isSelected() && button4.isSelected()) {
                    button2.setBackground(Color.GREEN);
                    button4.setBackground(Color.GREEN);
                } else {
                    if (button4.isSelected()) {
                        button2.setBackground(Color.RED);
                        button4.setBackground(Color.GREEN);
                    } else {
                        if (button2.isSelected()) {
                            button4.setBackground(Color.RED);
                            button2.setBackground(Color.GREEN);
                        } else {
                            button4.setBackground(Color.RED);
                            button2.setBackground(Color.RED);
                        }
                    }
                } 
                if (button1.isSelected())
                    button1.setBackground(Color.RED);
                if (button3.isSelected())
                    button3.setBackground(Color.RED);
            }
    	}
    }

	public static void main(String args[]) throws FileNotFoundException {
		Problema3 fereastra = new Problema3("Problema2");
	}
}