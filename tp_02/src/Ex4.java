import javax.swing.*;
import java.awt.BorderLayout;
import java.util.*;
import java.awt.*;

public class Ex4 extends JFrame{
    private static ArrayList<JButton> btn_added= new ArrayList<JButton>();

    public Ex4(){
        setTitle("creation et supp des button max => 50");
        setBounds(250,200,400,400);
        getContentPane().setBackground(new java.awt.Color(255,250,205));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn_add = new JButton("clic clic");
        JButton btn_delete = new JButton("supprimen button");

        JPanel buttonContainer = new JPanel();

        this.add(btn_add, BorderLayout.NORTH);
        this.add(btn_delete, BorderLayout.SOUTH);
        this.add(buttonContainer, BorderLayout.CENTER);
        setVisible(true);


        btn_add.addActionListener(e->{
            btn_push(buttonContainer);
            this.revalidate();
        });

        btn_delete.addActionListener(action->{
            btn_delete(buttonContainer);
            this.revalidate();
            this.repaint();
        });
    }

    private static void btn_push(JPanel p){
        JButton b = new JButton();
        b.addActionListener(e->{
            ((JButton) e.getSource()).setBackground( Color.RED );
            btn_added.add( (JButton) e.getSource() );
        });
        p.add(b);
        b.setText("Button : "+p.getComponentCount());
    }

    private static void btn_delete(JPanel p){
        for (JButton jButton : btn_added) {
            p.remove(jButton);
        }
        btn_added.clear();
    }
}