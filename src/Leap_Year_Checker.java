import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leap_Year_Checker extends JFrame {
    private JButton btnCheckYear;
    private JTextField tfYear;
    private javax.swing.JPanel JPanel;

    public Leap_Year_Checker(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfYear.getText());
                if(num1 % 4== 0 && num1 % 100 != 0 || num1 % 400 == 0){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                }else{
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        Leap_Year_Checker app = new Leap_Year_Checker();
        app.setSize(1000, 400);
        app.setContentPane(app.JPanel);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Hello World");
        app.setVisible(true);
    }
}
