import javax.swing.*;
import java.awt.event.*;

public class Ex2 extends JFrame implements ActionListener {

    private JTextField t;
    private JPanel p;
    private JButton b;

    // private Container buttonLayout;

    public Ex2(){
        setTitle("creation des button");
        setBounds(250,200,400,400);
        getContentPane().setBackground(new java.awt.Color(255,250,205));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        // setResizable(false);

        this.t = new JTextField(16);
        this.b = new JButton("submit");
        this.b.setBackground(new java.awt.Color(210,180,140));

        this.p = new JPanel();
        this.p.add(this.t);
        this.p.add(this.b);
        getContentPane().add(this.p);
        this.b.addActionListener(this);
    }

    public void create_btn_as_nbr(int nbr){
        Box boxHorizontal = Box.createHorizontalBox();
        boxHorizontal.setBounds(250,200,300,300);
        this.p.add(boxHorizontal);
        for(int i=0; i<nbr ;i++){
            String info="button"+(i+1);
            boxHorizontal.add(new JButton(info));
        }
        
    }

    public void actionPerformed(ActionEvent e) {
        try{
            int nbr = Integer.parseInt(t.getText());
            System.out.println(nbr);
            create_btn_as_nbr(nbr);
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
    }

    public void windowClosing(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}