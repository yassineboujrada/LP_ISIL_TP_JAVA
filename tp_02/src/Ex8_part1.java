import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.*;

public class Ex8_part1 {

    public static void main(String[] args) {
        final String[] data_list = {"Java","C","C++","Pascal","Basic","Cobol","Fortran"};
        final int MAX = data_list.length;

        
        String[] listElems = new String[MAX];
        for (int i = 0; i < MAX; i++) {
            listElems[i] = data_list[i];
        }

        final JList list = new JList(listElems);
        final JScrollPane pane = new JScrollPane(list);
        final JPanel  buttonsPanel = new JPanel(new FlowLayout());
        final JFrame frame = new JFrame("JList version 1");


        final JButton btnGet = new JButton("Get ok");

        btnGet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> selectedElem = new ArrayList<String>();
                int selectedIndices[] = list.getSelectedIndices();
                for (int j = 0; j < selectedIndices.length; j++) {
                    String elem = (String) list.getModel().getElementAt(selectedIndices[j]);
                    selectedElem.add(elem);
                }

                buttonsPanel.removeAll();
                for (String string : selectedElem) {
                    buttonsPanel.add(new JButton(string));
                    frame.revalidate();
                }
            }
        });

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(pane, BorderLayout.WEST);
        frame.getContentPane().add(buttonsPanel, BorderLayout.EAST);
        frame.getContentPane().add(btnGet, BorderLayout.SOUTH);
        frame.setBounds(350,200,450,300);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
