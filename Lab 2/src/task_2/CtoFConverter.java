import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The CtoFConverter class displays a JFrame that
 * lets the user enter a temperature in Celsius. When
 * the Calculate button is clicked, a dialog box is
 * displayed with the temperature converted to Fahrenheit.
 */
public class CtoFConverter extends JFrame {

    private JPanel panel; // To reference a panel
    private JTextField celsiusTextField; // To reference a text field
    private final int WINDOW_WIDTH = 310; // Window width
    private final int WINDOW_HEIGHT = 100; // Window height

    /**
     * Constructor
     */
    public CtoFConverter() {
        // Set the window title.
        setTitle("C to F Converter");

        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Build the panel and add it to the frame.
        buildPanel();

        // Add the panel to the frame's content pane.
        add(panel);

        // Display the window.
        setVisible(true);
    }

    /**
     * The buildPanel method adds a label, a text field,
     * and a button to a panel.
     */
    private void buildPanel() {
        // Create a label to display instructions.
        // To reference a label
        JLabel messageLabel = new JLabel("Enter a temperature in Celsius");

        // Create a text field 8 characters wide.
        celsiusTextField = new JTextField(8);

        // Create a button with the caption "Calculate".
        // To reference a button
        JButton calcButton = new JButton("Calculate");

        // Add an action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());

        // Create a JPanel object and let the panel
        // field reference it.
        panel = new JPanel();

        // Add the label, text field, and button
        // components to the panel.
        panel.add(messageLabel);
        panel.add(celsiusTextField);
        panel.add(calcButton);
    }

    /**
     * CalcButtonListener is an action listener class for
     * the Calculate button.
     */
    private class CalcButtonListener implements ActionListener {

        /**
         * The actionPerformed method executes when the user
         * clicks on the Calculate button.
         * @param e The event object.
         */
        public void actionPerformed(ActionEvent e) {
            String input; // To hold the user's input
            double fahrenheit; // The number of fahrenheit

            // Get the text entered by the user into the
            // text field.
            input = celsiusTextField.getText();

            // Parse the input into double.
            double celsius = Double.parseDouble(input);

            // Convert the input to fahrenheit.
            fahrenheit = (celsius + 32) * 5 / 9;

            // Display the result.
            JOptionPane.showMessageDialog(null, input + " Celsius is " + fahrenheit + " degrees Fahrenheit.");
        }
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        new CtoFConverter();
    }
}
