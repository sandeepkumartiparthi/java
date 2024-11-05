import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SimpleCalculator extends Applet implements ActionListener {
    TextField display;
    double num1, num2, result;
    String operator;

    public void init() {
        setLayout(new BorderLayout());

        display = new TextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};
        for (String text : buttons) {
            Button button = new Button(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } else if (command.equals("C")) {
            display.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText().split(" ")[2]);
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }
            display.setText(String.valueOf(result));
        } else {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText(display.getText() + " " + operator + " ");
        }
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Simple Calculator");
        SimpleCalculator applet = new SimpleCalculator();
        applet.init();
        frame.add(applet);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}
