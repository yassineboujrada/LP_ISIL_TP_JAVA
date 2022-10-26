import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Ex8_part2 {

    public static void main(String[] args) {
        
        final String[] data_list = {"Java","C","C++","Pascal","Basic","Cobol","Fortran"};
        final int MAX = data_list.length;
        // initialize list elements
        String[] listElems = new String[MAX];
        for (int i = 0; i < MAX; i++) {
            listElems[i] = data_list[i];
        }

        final JList<String> list = new JList<String>(listElems);
        final JScrollPane pane = new JScrollPane(list);
        final JPanel  buttonsPanel = new JPanel(new FlowLayout());
        final JFrame frame = new JFrame("JList version 2");

        list.addListSelectionListener(e->{
            boolean adjust = e.getValueIsAdjusting();
            if (!adjust) {
                JList<String> list1 = (JList<String>) e.getSource();
                int selections[] = list1.getSelectedIndices();
                Object selectionValues[] = list1.getSelectedValuesList().toArray();
                buttonsPanel.removeAll();
                for (int i = 0, n = selections.length; i < n; i++) {
                    buttonsPanel.add(new JButton((String)selectionValues[i]));
                    frame.revalidate();
                }   
            } 
        });
        

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(pane, BorderLayout.WEST);
        frame.getContentPane().add(buttonsPanel, BorderLayout.EAST);
        // frame.setSize(250, 200);
        frame.setVisible(true);
        frame.setBounds(350,200,550,300);
    }
}