import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// integre

// public class Ex10 extends JFrame implements ActionListener {
    
//     private JTextField value = new JTextField("Question ?");
//     private JButton submit = new JButton("OK");
//     private JPanel contaner = new JPanel();
//     private JTextArea add_question = new JTextArea();

//     public Ex10(){
//         setTitle("Quisionnaire par integre");
//         setBounds(250,200,400,300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//         this.contaner.setLayout(new GridLayout(3,1));
//         this.contaner.add(value);
//         this.contaner.add(submit);
//         this.contaner.add(add_question);
//         this.add(this.contaner);
//         this.submit.addActionListener(this);
//         this.value.addActionListener(this);
//     }

//     public void actionPerformed(ActionEvent e) {
//         this.add_question.setText(this.add_question.getText()+"\n"+this.value.getText());
//     }

//     public void windowClosing(WindowEvent e) {}
//     public void windowOpened(WindowEvent e) {}
//     public void windowActivated(WindowEvent e) {}
//     public void windowIconified(WindowEvent e) {}
//     public void windowDeiconified(WindowEvent e) {}
//     public void windowDeactivated(WindowEvent e) {}
//     public void windowClosed(WindowEvent e) {}
// }

// anonyme 

// public class Ex10 extends JFrame{
//     private JTextField value = new JTextField("Question ?");
//     private JButton submit = new JButton("OK");
//     private JPanel contaner = new JPanel();
//     private JTextArea add_question = new JTextArea();

//     public Ex10(){
//         setTitle("Quisionnaire par integre");
//         setBounds(250,200,400,300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//         this.contaner.setLayout(new GridLayout(3,1));
//         this.contaner.add(value);
//         this.contaner.add(submit);
//         this.contaner.add(add_question);
//         this.add(this.contaner);

//         this.submit.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 add_question.setText(add_question.getText()+"\n"+value.getText());
//             }
//         });
//     }
// }

// extern

// public class Ex10 extends JFrame {
//     private JTextField value = new JTextField("Question ?");
//     private JButton submit = new JButton("OK");
//     private JPanel contaner = new JPanel();
//     private JTextArea add_question = new JTextArea();

//     public Ex10(){
//         setTitle("Quisionnaire par integre");
//         setBounds(250,200,400,300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//         this.contaner.setLayout(new GridLayout(3,1));
//         this.contaner.add(value);
//         this.contaner.add(submit);
//         this.contaner.add(add_question);
//         this.add(this.contaner);

//         Ex10_extern entre = new Ex10_extern(add_question,value);

//         this.submit.addActionListener(entre);
//         this.value.addActionListener(entre);
//     }
// }

// class Ex10_extern implements ActionListener{
//     private JTextArea add_question ;
//     private JTextField value;

//     public Ex10_extern(JTextArea add_question,JTextField value){
//         this.add_question=add_question;
//         this.value=value;
//     }

//     public void actionPerformed(ActionEvent e) {
//         add_question.setText(add_question.getText()+"\n"+value.getText());
//     }

//     public void windowClosing(WindowEvent e) {}
//     public void windowOpened(WindowEvent e) {}
//     public void windowActivated(WindowEvent e) {}
//     public void windowIconified(WindowEvent e) {}
//     public void windowDeiconified(WindowEvent e) {}
//     public void windowDeactivated(WindowEvent e) {}
//     public void windowClosed(WindowEvent e) {}
// }


// intern 

public class Ex10 extends JFrame {
    private JTextField value = new JTextField("Question ?");
    private JButton submit = new JButton("OK");
    private JPanel contaner = new JPanel();
    private JTextArea add_question = new JTextArea();

    public Ex10(){
        setTitle("Quisionnaire par integre");
        setBounds(250,200,400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.contaner.setLayout(new GridLayout(3,1));
        this.contaner.add(value);
        this.contaner.add(submit);
        this.contaner.add(add_question);
        this.add(this.contaner);
        this.submit.addActionListener(new Ex10_intern());
        this.value.addActionListener(new Ex10_intern());
    }

    class Ex10_intern implements ActionListener{
    
        public void actionPerformed(ActionEvent e) {
            Ex10.this.add_question.setText(Ex10.this.add_question.getText()+"\n"+Ex10.this.value.getText());
        }
    
        public void windowClosing(WindowEvent e) {}
        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}
    }
    
}


