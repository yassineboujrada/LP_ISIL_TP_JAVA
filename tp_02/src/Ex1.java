import javax.swing.* ;
import java.awt.event.*;

public class Ex1 extends JFrame implements MouseListener{
    public Ex1(){
        setTitle("detecte les evenments");
        setBounds(250,200,400,200);
        getContentPane().setBackground(new java.awt.Color(160,82,45));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(this) ;
    }

    public void mousePressed(MouseEvent evt){
        System.out.println("Pressed in x => "+ evt.getX() + " y=> " + evt.getY() );
    };

    public void mouseReleased(MouseEvent evt){
        System.out.println ("relased in x => " + evt.getX() + ", y=> " + evt.getY() );
    };

    public void mouseClicked (MouseEvent evt) {}
    public void mouseEntered (MouseEvent evt) {}
    public void mouseExited (MouseEvent evt) {}
}