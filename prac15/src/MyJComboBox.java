import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJComboBox{
    public static void test(){
        JFrame frame = new JFrame("TestJComboBox");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        String[] countries = {
                "Russia",
                "USA",
                "Italy",
                "China"
        };

        JPanel info = new JPanel();
        JLabel info_label = new JLabel();
        GridLayout layoutMain = new GridLayout(2, 1);
//        info_label.setLocation(100, 100);
        info.add(info_label);
        JComboBox<String> jComboBox = new JComboBox<String>(countries);
        jComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox<String> combo = (JComboBox<String>) event.getSource();
                String selectedBook = (String) combo.getSelectedItem();

                assert selectedBook != null;
                switch (selectedBook) {
                    case "Russia" -> info_label.setText("Russia's area is 17,100,000 km²");
                    case "USA" -> info_label.setText("USA's area is 9 834 000 km²");
                    case "Italy" -> info_label.setText("Italy's area is 302 073 km²");
                    case "China" -> info_label.setText("China's area is 9 597 000 km²");
                }

            }
        });

        JPanel main = new JPanel();
        main.add(jComboBox);
        main.add(info);
        main.setLayout(layoutMain);
        frame.add(main);
        frame.setSize(300, 100);
        frame.setVisible(true);

    }
}