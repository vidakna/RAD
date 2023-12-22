import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Q4 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton clickButton;
    private JLabel l1;
    private JLabel l2;
    private JPanel main;

    public Q4() {
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fname=String.valueOf(textField1.getText());
                String lname=String.valueOf(textField2.getText());
              String ans= String.valueOf( fname+" "+lname);
                JOptionPane.showMessageDialog(null,ans,"Full Name", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        Q4 add=new Q4();
        add.setVisible(true);
        add.setContentPane(add.main);
        add.setSize(450,300);
    }
}
