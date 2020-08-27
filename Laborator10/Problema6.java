import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Problema6 extends JFrame implements ActionListener {
	JTextField text;
	JButton button;
	JScrollPane scroll;
	JTextArea textarea;

	public Problema6(String text_string) {
		super(text_string);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setMinimumSize(new Dimension(500, 500));
        frame.getContentPane().setBackground(Color.yellow);
        frame.setLayout(new FlowLayout());

        textarea = new JTextArea(15, 15);
        scroll = new JScrollPane(textarea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // scroll.setVisible(true);
        // scroll.setVisible(false);
        frame.add(scroll);

        text = new JTextField(15);
        frame.add(text);
        text.addActionListener(this);

        button = new JButton("Afiseaza");
        frame.add(button);
        button.addActionListener(this);

        frame.show();
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() instanceof JButton) {
    		String path = text.getText();
    		File f = new File(path);

    		if (f.exists() && !f.isDirectory()) {
				scroll.setVisible(true);		
				try {	
    			Scanner sc = new Scanner(f);
    			String aux = "";

    			while(sc.hasNextLine()) {
    				aux += sc.nextLine() + "\r\n";
    			}
    			textarea.setText(aux);
    		} catch(Exception ex) {
    			ex.printStackTrace();
    		}
    		} else {
    			scroll.setVisible(false);
    			text.setText("");
    		}
    	}
    }

    public static void main(String args[]) {
    	Problema6 fereastra = new Problema6("problema6");
    }
}