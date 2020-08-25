import java.lang.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Problema4 extends JFrame implements ActionListener{
    private JSlider slide1;
    private JSlider slide2;
    private JSlider slide3;
    private JTextArea text;

    public Problema4(String text_string) {
        super(text_string);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 500));
        getContentPane().setBackground(Color.yellow);
        setLayout(new FlowLayout());

        text = new JTextArea(10, 10);
        add(text);

        slide1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        slide2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        slide3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

        add(slide1);
        add(slide2);
        add(slide3);

        ChangeListener list = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent event) {
                Color color = new Color(slide1.getValue(), slide2.getValue(),
                    slide3.getValue());
                text.setBackground(color);
            }
        };

        slide1.addChangeListener(list);
        slide2.addChangeListener(list);
        slide3.addChangeListener(list);

        show();
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

	public static void main(String args[]) throws FileNotFoundException {
		Problema4 fereastra = new Problema4("Problema2");
	}
}