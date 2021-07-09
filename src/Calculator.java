import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {

  JFrame frame;
  JTextField textField;
  JButton[] numberButton = new JButton[10];
  JButton[] functionButton = new JButton[8];
  JButton addButton, subButton, mulButton, divButton;
  JButton decButton, equButton, delButton, clrButton;
  JPanel panel;

  Font myFont = new Font("Sans Serif", Font.BOLD, 30);

  Calculator() {}

  public static void main(String[] args) {
    Calculator calc = new Calculator();
  }

  @Override
  public void actionPerformed(ActionEvent e) {}
}
