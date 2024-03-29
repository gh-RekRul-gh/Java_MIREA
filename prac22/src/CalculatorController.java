import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CalculatorController {
    private final CalculatorUI calculatorUI;
    private final Expression expression;
    private boolean wasResult = false;

    public CalculatorController(Expression expression) {

        JButton[] numberButtons = new JButton[10];
        JButton equalsButton = new JButton("=");
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton divButton = new JButton("/");
        JButton mulButton = new JButton("*");
        JButton numberEndButton = new JButton("Space");
        JButton backSpaceButton = new JButton("BackSpace");
        JButton clearButton = new JButton("C");

        for (int i = 0; i < 10; i++)
            numberButtons[i] = new JButton(String.valueOf(i));

        calculatorUI = new CalculatorUI(numberButtons, equalsButton, addButton, subButton, divButton, mulButton,
                numberEndButton, backSpaceButton, clearButton);
        this.expression = expression;

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            numberButtons[i].addActionListener(e -> {
                if (wasResult) {
                    calculatorUI.setText("");
                    wasResult = false;
                }
                calculatorUI.setText(calculatorUI.getText() + finalI);
            });
        }

        equalsButton.addActionListener(e -> {
            String in = calculatorUI.getText();
            if (!Objects.equals(in, "")) {
                try {
                    expression.calculation(in);
                    calculatorUI.updateUI(expression.getExpression(), expression.getResult());
                    wasResult = true;
                } catch (NotSolvableException ex) {
                    JOptionPane.showMessageDialog(calculatorUI,
                            ex.getMessage());
//                    expression.clearResult();
                }
            }
        });


        addButton.addActionListener(e -> {
            if (wasResult) {
                calculatorUI.setText("");
                wasResult = false;
            }
            calculatorUI.setText(calculatorUI.getText() + "+");
        });

        subButton.addActionListener(e -> {
            if (wasResult) {
                calculatorUI.setText("");
                wasResult = false;
            }
            calculatorUI.setText(calculatorUI.getText() + "-");
        });

        mulButton.addActionListener(e -> {
            if (wasResult) {
                calculatorUI.setText("");
                wasResult = false;
            }
            calculatorUI.setText(calculatorUI.getText() + "*");
        });

        divButton.addActionListener(e -> {
            if (wasResult) {
                calculatorUI.setText("");
                wasResult = false;
            }
            calculatorUI.setText(calculatorUI.getText() + "/");
        });

        numberEndButton.addActionListener(e -> {
            if (wasResult) {
                calculatorUI.setText("");
                wasResult = false;
            }
            calculatorUI.setText(calculatorUI.getText() + " ");
        });

        backSpaceButton.addActionListener(e -> {
            if (wasResult) {
                calculatorUI.setText("");
                wasResult = false;
            }
            StringBuilder in = new StringBuilder(calculatorUI.getText());
            if (!in.isEmpty()) {
                in.deleteCharAt(in.length() - 1);
                calculatorUI.setText(String.valueOf(in));
            }
        });

        clearButton.addActionListener(e -> {
            calculatorUI.setText("");
        });
    }
}