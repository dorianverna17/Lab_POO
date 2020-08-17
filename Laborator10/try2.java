import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Text extends JFrame implements ActionListener{
    private JButton button;
    private JTextField user;
    private JPasswordField pass;
    private JTextArea textArea;  
    private JScrollPane scroll;
 
    public Text (String text){
        super(text);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 200));
        getContentPane().setBackground(Color.blue);
        setLayout(new FlowLayout());
        button = new JButton ("Apasa");
        button.addActionListener(this);
        add(button);
        user = new JTextField(15);
        add(user);
        pass = new JPasswordField(15);
        add(pass);
        textArea = new JTextArea(20, 10);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Tahoma", 2, 12));
        scroll = new JScrollPane(textArea);
        add(scroll);
        show();
        pack();
    }
 
    public static void main (String args[]){ 
        Text b = new Text ("LaboratorPOO");
    }
 
    @Override
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton)e.getSource();
        if (button.getText().equals("Apasa")){
            System.out.println(user.getText() + pass.getText());
        }
    }
}