import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex5 extends JFrame{

    public Ex5(){
        setTitle("Carres");
        setBounds(250,200,400,140);
        getContentPane().setBackground(new java.awt.Color(255,250,205));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nbr_label = new JLabel("Nombre");
        JTextField value = new JTextField("");
        JPanel containner_holder = new JPanel();
        value.setPreferredSize(new Dimension(80 , 25));
        JLabel carre_label = new JLabel("Carre : ");
        containner_holder.setLayout(new FlowLayout());
        containner_holder.add(nbr_label);
        containner_holder.add(value);
        containner_holder.add(carre_label);
        
        //  Outil 1:

        // JButton submit = new JButton("Calculate");
        // containner_holder.add(submit);
        // submit.addActionListener(evt->{
        //     try{
        //         int nbr = Integer.parseInt(value.getText());
        //         System.out.println(nbr);
        //         carre_label.setText("Carre : "+(nbr*nbr));
        //     }catch(Exception err){
        //         System.out.println(err.getMessage());
        //         value.setText("");
        //     }
        // });

        //  Outil 2:
        
        value.addFocusListener(new FocusListener(){
            @Override
            public void focusLost(FocusEvent e) {}
            
            public void focusGained(FocusEvent e) {
                System.out.println("focusLost");
                actualise(value,carre_label);
            }
        });

        getContentPane().add(containner_holder);
        setVisible(true);
        setResizable(false);
    }
    
    private static void actualise(JTextField nbr_label,JLabel carre_label){
        try{
            int nbr = Integer.parseInt(nbr_label.getText());
            System.out.println(nbr);
            carre_label.setText("Carre : "+(nbr*nbr));
        }catch(Exception err){
            System.out.println(err.getMessage());
            nbr_label.setText("");
        }
    }
}
