import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame{
    
    public Ex3(){    
        JButton btn1 = new JButton("clic clic");
        JButton btn2 = new JButton("un deuxieme button");
        JLabel label = new JLabel("un petit texte");
        
        this.add(btn1, BorderLayout.NORTH);
        this.add(btn2, BorderLayout.SOUTH);
        this.add(label, BorderLayout.CENTER);

        setBounds(250,200,300,200);
        getContentPane().setBackground(new java.awt.Color(210,180,140));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

}
