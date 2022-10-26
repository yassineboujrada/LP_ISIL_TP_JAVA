import javax.swing.*;
// import java.awt.event.*;
import java.awt.*;

public class Ex7 {
    public static void main(String[] args) {

        JFrame my_fenetre = new JFrame("my_fenetre");
        JPanel p = new JPanel(new BorderLayout());
        JPanel checkBoxesContainer = new JPanel();
        JRadioButton check_1 = new JRadioButton("Cercle");
        JRadioButton check_2 = new JRadioButton("Rectangle");
        JRadioButton check_3 = new JRadioButton("Triangle");
        JRadioButton check_4 = new JRadioButton("Pentagone");
        JRadioButton check_5 = new JRadioButton("Eclipse");
        JRadioButton check_6 = new JRadioButton("Carre");
        
        check_1.setActionCommand("Cercle");
        check_2.setActionCommand("Rectangle");
        check_3.setActionCommand("Triangle");
        check_4.setActionCommand("Pentagone");
        check_5.setActionCommand("Eclipse");
        check_6.setActionCommand("Carre");

        checkBoxesContainer.add(check_1);
        checkBoxesContainer.add(check_2);
        checkBoxesContainer.add(check_3);
        checkBoxesContainer.add(check_4);
        checkBoxesContainer.add(check_5);
        checkBoxesContainer.add(check_6);
        
        
        ButtonGroup group =  new ButtonGroup();
        group.add(check_1);
        group.add(check_2);
        group.add(check_3);
        group.add(check_4);
        group.add(check_5);
        group.add(check_6);

        JButton radio_btn = new JButton("Etat");

        radio_btn.addActionListener(e->{
            System.out.println("you select => "+group.getSelection().getActionCommand());
        });

        p.add(checkBoxesContainer,BorderLayout.CENTER);
        p.add(radio_btn,BorderLayout.SOUTH);

        my_fenetre.setBounds(250,200,250,200);
        my_fenetre.getContentPane().add(p);
        my_fenetre.setVisible(true);
    }
}