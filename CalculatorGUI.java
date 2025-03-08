import java.awt.*;
import javax.swing.*;


public class CalculatorGUI extends JFrame  {
    private JTextField textField;

    public CalculatorGUI() {
        setTitle("Calculator");
        setSize(450, 600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Output Panel
        JPanel outputPanel = new JPanel();
        textField = new JTextField(18); 
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24)); 
        textField.setHorizontalAlignment(JTextField.RIGHT);
        outputPanel.add(textField);
        add(outputPanel, BorderLayout.NORTH);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "AC", "C", "±", "√" 
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20)); 
            // Set different colors for numbers and other buttons
            if (text.matches("[0-9]")) {
                button.setBackground(new Color(173, 216, 230)); 
            } else if (text.equals("=")) {
                button.setBackground(new Color(255, 165, 0));
            } else {
                button.setBackground(new Color(144, 238, 144));
            }

            button.setOpaque(true);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            button.setPreferredSize(new Dimension(100, 100));
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }



    public static void main(String[] args) {
        new CalculatorGUI();
    }
}