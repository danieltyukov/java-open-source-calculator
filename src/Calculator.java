import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {

  JFrame frame;
  JTextField textfield;
  JButton[] numberButton = new JButton[10];
  JButton[] functionButton = new JButton[8];
  JButton addButton, subButton, mulButton, divButton;
  JButton decButton, equButton, delButton, clrButton;
  JPanel panel;

  Font myFont = new Font("Sans Serif", Font.BOLD, 30);

  double num1 = 0, num2 = 0, result = 0;
  char operator;

  Calculator() {
    frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 550);
    frame.setLayout(null);

    textfield = new JTextField();
    textfield.setBounds(50, 25, 300, 50);
    textfield.setFont(myFont);
    textfield.setEditable(false);

    addButton = new JButton("+");
    subButton = new JButton("-");
    mulButton = new JButton("*");
    divButton = new JButton("/");
    decButton = new JButton(".");
    equButton = new JButton("=");
    delButton = new JButton("Delete");
    clrButton = new JButton("Clear");

    frame.add(textfield);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Calculator calc = new Calculator();
  }

  @Override
  public void actionPerformed(ActionEvent e) {}
}
