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

    functionButton[0] = addButton;
    functionButton[1] = subButton;
    functionButton[2] = mulButton;
    functionButton[3] = divButton;
    functionButton[4] = decButton;
    functionButton[5] = equButton;
    functionButton[6] = delButton;
    functionButton[7] = clrButton;

    for (int i = 0; i < 8; i++) {
      functionButton[i].addActionListener(this);
      functionButton[i].setFont(myFont);
      functionButton[i].setFocusable(false);
    }

    for (int i = 0; i < 10; i++) {
      numberButton[i] = new JButton(String.valueOf(i));
      numberButton[i].addActionListener(this);
      numberButton[i].setFont(myFont);
      numberButton[i].setFocusable(false);
    }

    delButton.setBounds(50, 430, 145, 50);
    clrButton.setBounds(205, 430, 145, 50);

    panel = new JPanel();
    panel.setBounds(50, 100, 300, 300);
    panel.setLayout(new GridLayout(4, 4, 10, 10));

    frame.add(delButton);
    frame.add(clrButton);
    frame.add(textfield);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Calculator calc = new Calculator();
  }

  @Override
  public void actionPerformed(ActionEvent e) {}
}
