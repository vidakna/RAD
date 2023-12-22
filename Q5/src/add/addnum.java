package add;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addnum extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton calculateButton;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JPanel main;
    private JLabel l5;


    public addnum() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());

                    double total = num1 + num2;

                    l5.setText(String.valueOf(total));
                }catch (Exception e1){
                  JOptionPane.showMessageDialog(rootPane,e1.getMessage(),"Input Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
      addnum add=new addnum();
      add.setVisible(true);
      add.setContentPane(add.main);
      add.setSize(450,300);
    }
}

