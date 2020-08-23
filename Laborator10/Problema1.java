import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Problema1 extends JFrame implements ActionListener{
	private JButton button;
	private JTextField disk;
	private JTextField path;
	private JTextField name;
	private JTextArea result;

	public Problema1(String text) {
		super(text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());
        button = new JButton ("See the file path");
        button.addActionListener(this);
        add(button);
        disk = new JTextField(3);
        disk.addActionListener(this);
        add(disk);
        path = new JTextField(15);
        add(path);
        name = new JTextField(15);
        add(name);
       	result = new JTextArea(20, 10);
        result.setLineWrap(true);
        result.setWrapStyleWord(true);
        result.setFont(new Font("Tahoma", 2, 12));
        add(result);
        show();
        pack();
	}

	public static void main(String args[]) {
		Problema1 fereastra = new Problema1("Problema1");
	}

	@Override
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton)e.getSource();
        if (button.getText().equals("See the file path")){
        	result.setText(disk.getText() + path.getText() + name.getText() + "\r\n");
        }
    }
}