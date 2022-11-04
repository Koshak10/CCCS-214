import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The TempConvertor program converts Celsius
 * temperatures to Fahrenheit and vice versa.
 */
public class TempConverter extends JFrame {

    private JTextField celsiusTemp;         // Celsius temp
    private JTextField fahrenheitTemp;      // Fahrenheit temp
    private JRadioButton celsiusButton;     // To convert to Celsius
    private JRadioButton fahrenheitButton;  // To convert to Fahrenheit
    private ButtonGroup radioButtonGroup;   // To group radio buttons
    private final int WINDOW_WIDTH = 320;   // Window width
    private final int WINDOW_HEIGHT = 170;  // Window height

    /**
     * Constructor
     */
    public TempConverter() {
        // Set the title.
        setTitle("Temperature Converter");

        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a FlowLayout manager to the content pane.
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Create four panels.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        // Create two labels.
        JLabel label1 = new JLabel("Celsius ");
        JLabel label2 = new JLabel("Fahrenheit ");

        // Create the text field and radio buttons.
        celsiusTemp = new JTextField(10);
        fahrenheitTemp = new JTextField(10);
        celsiusButton = new JRadioButton("Celsius");
        fahrenheitButton = new JRadioButton("Fahrenheit");

        // Group the radio buttons.
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(celsiusButton);
        radioButtonGroup.add(fahrenheitButton);

        // Create a button with the caption "Calculate".
        JButton calcButton = new JButton("Calculate");

        // Add an action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());

        // Add the label, text field, and button
        // components to the panels.
        panel1.add(label1);
        panel1.add(celsiusTemp);
        panel2.add(label2);
        panel2.add(fahrenheitTemp);
        panel3.add(celsiusButton);
        panel3.add(fahrenheitButton);
        panel4.add(calcButton);

        // Add the four panels to the content pane.
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        // Display the window.
        setVisible(true);
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
            double celsius, fahrenheit; // To hold the temperatures

            if (celsiusButton.isSelected()) {
                // Get the Fahrenheit temperature and convert it
                // to a double.
                fahrenheit = Double.parseDouble(fahrenheitTemp.getText());

                // Calculate the Celsius temperature.
                celsius = (5.0 / 9.0) * (fahrenheit - 32.0);

                // Store the Fahrenheit temp in its display field.
                fahrenheitTemp.setText(Double.toString(fahrenheit));

                // Store the Celsius temp in its display field.
                celsiusTemp.setText(String.format("%.1f", celsius));
            }

            if (fahrenheitButton.isSelected()) {
                // Get the Celsius temperature and convert it
                // to a double.
                celsius = Double.parseDouble(celsiusTemp.getText());

                // Calculate the Fahrenheit temperature.
                fahrenheit = (9.0 / 5.0) * celsius + 32.0;

                // Store the Celsius temp in its display field.
                celsiusTemp.setText(Double.toString(celsius));

                // Store the Fahrenheit temp in its display field.
                fahrenheitTemp.setText(String.format("%.1f", fahrenheit));
            }
        }
    }

    /**
     * The main method creates an instance of the
     * TempConverter class, displaying its window.
     */
    public static void main(String[] args) {
        new TempConverter();
    }
}
