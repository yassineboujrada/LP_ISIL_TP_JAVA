
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Ex6 extends JFrame {
    public ArrayList<JCheckBox> btns= new ArrayList<JCheckBox>();

    public Ex6(){
        JCheckBox circle_check,rectangle_check,triangle_check;

        JButton btn_raz = new JButton("RAZ");
        JButton btn_etat = new JButton("Etat");

        circle_check = new JCheckBox("Cercle");
        rectangle_check = new JCheckBox("Rectangle");
        triangle_check = new JCheckBox("Triangle");

        JPanel buttonContainer = new JPanel();

        buttonContainer.add(circle_check);
        buttonContainer.add(rectangle_check);
        buttonContainer.add(triangle_check);

        this.add(btn_raz, BorderLayout.NORTH);
        this.add(btn_etat, BorderLayout.SOUTH);
        this.add(buttonContainer, BorderLayout.CENTER);
        
        setTitle("Cases a cocher");
        setBounds(250,200,400,400);
        getContentPane().setBackground(new java.awt.Color(255,250,205));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);


        btn_raz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (JCheckBox i : btns) {
                    i.setSelected(false);
                }
                revalidate();
            }
        });

        btn_etat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(JCheckBox i : btns){
                    if(i.isSelected()){
                        System.out.println("you selected"+i.getText());
                    }
                }
                revalidate();
                repaint();
        }});

        

    }
}


// public static ArrayList<JCheckBox> buttonsList= new ArrayList<JCheckBox>();
//     public static void main(String[] args) {

//         JFrame window = new JFrame("window");
//         JPanel p = new JPanel(new BorderLayout());
//         JPanel checkBoxesContainer = new JPanel();
//         JCheckBox cBox1 = new JCheckBox("Cercle");
//         JCheckBox cBox2 = new JCheckBox("Rectangle");
//         JCheckBox cBox3 = new JCheckBox("Triangle");
//         buttonsList.add(cBox1);
//         buttonsList.add(cBox2);
//         buttonsList.add(cBox3);
//         checkBoxesContainer.add(cBox1);
//         checkBoxesContainer.add(cBox2);
//         checkBoxesContainer.add(cBox3);
//         JButton uncheckboxes = new JButton("RAZ");
//         uncheckboxes.addActionListener(e->{
//             for (JCheckBox checkBox : buttonsList) {
//                 checkBox.setSelected(false);
//             }
//             window.revalidate();
//         });
//         JButton logcheckedboxes = new JButton("Etat");
//         logcheckedboxes.addActionListener(e->{
//             for (JCheckBox checkBox : buttonsList) {
//                 if(checkBox.isSelected()){
//                     System.out.println(checkBox.getText()+" is selected");
//                 }
//             }
//             window.revalidate();
//             window.repaint();
//         });
//         p.add(uncheckboxes,BorderLayout.NORTH);
//         p.add(checkBoxesContainer,BorderLayout.CENTER);
//         p.add(logcheckedboxes,BorderLayout.SOUTH);
//         window.setSize(250,250);
//         window.getContentPane().add(p);
//         window.setVisible(true);
//     }
