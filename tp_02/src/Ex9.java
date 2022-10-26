import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

public class Ex9 extends JFrame implements MouseListener{
    
    private JLabel label = new JLabel("chnage color");

    public Ex9(){
        setTitle("gestion les evenments");
        setBounds(250,200,400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        this.add(this.label,BorderLayout.CENTER);
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent evt){
        // this.label.setBackground(new java.awt.Color(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
    };

    public void mouseReleased(MouseEvent evt){};
    public void mouseClicked (MouseEvent evt) {}
    public void mouseEntered (MouseEvent evt) {
        this.getContentPane().setBackground(new java.awt.Color(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
    }
    public void mouseExited (MouseEvent evt) {}
}



// anonyme
// public class Ex9 extends JFrame{
    
//     private JLabel label = new JLabel("chnage color");

//     public Ex9(){
//         setTitle("gestion les evenments");
//         setBounds(250,200,400,200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//         setResizable(false);
//         this.add(this.label,BorderLayout.CENTER);

//         addMouseListener(new MouseAdapter() {
//             public void mouseEntered(MouseEvent e) {
//                 getContentPane().setBackground(new java.awt.Color(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
//             }
//         });
//     }
// }

//externe

// public class Ex9 extends JFrame {
    
//     private JLabel label = new JLabel("chnage color");

//     public Ex9(){
//         setTitle("gestion les evenments");
//         setBounds(250,200,400,200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//         setResizable(false);
//         this.add(this.label,BorderLayout.CENTER);

//         Ex9_extern entre = new Ex9_extern(this.getContentPane());

//         addMouseListener(entre);
//     }
// }

// class Ex9_extern implements MouseListener{
//     private Container pane ;

//     public Ex9_extern(Container container){
//         this.pane=container;
//     }
//     public void mousePressed(MouseEvent evt){
//     };

//     public void mouseReleased(MouseEvent evt){};
//     public void mouseClicked (MouseEvent evt) {};
//     @Override
//     public void mouseEntered (MouseEvent evt) {
//         this.pane.setBackground(new java.awt.Color(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
//     }
//     public void mouseExited (MouseEvent evt) {};
// }



//interne
// public class Ex9 extends JFrame {
    
//     private JLabel label = new JLabel("chnage color");

//     public Ex9(){
//         setTitle("gestion les evenments");
//         setBounds(250,200,400,200);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//         setResizable(false);
//         this.add(this.label,BorderLayout.CENTER);


//         addMouseListener(new Ex9_intern());
//     }

//     class Ex9_intern implements MouseListener{
//         public void mousePressed(MouseEvent evt){};
//         public void mouseReleased(MouseEvent evt){};
//         public void mouseClicked (MouseEvent evt) {};
//         public void mouseEntered (MouseEvent evt) {
//             Ex9.this.getContentPane().setBackground(new java.awt.Color(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
//         };
//         public void mouseExited (MouseEvent evt) {};
//     }
// }