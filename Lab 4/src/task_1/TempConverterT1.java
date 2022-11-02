import javax.swing.*;
import java.awt.*;

public class TempConverterT1 extends JFrame {

    private JPanel panel1;                  // To reference panel one
    private JPanel panel2;                  // To reference panel two
    private JPanel panel3;                  // To reference panel three
    private JPanel panel4;                  // To reference panel four
    private JRadioButton celsiusButton;     // To convert to Celsius
    private JRadioButton fahrenheitButton;  // To convert to Fahrenheit
    private JTextField celsius;             // Celsius temperature
    private JTextField fahrenheit;          // Fahrenheit temperature

    /**
     * Constructor
     */
    public TempConverterT1() {
        final int WINDOW_WIDTH = 320;   // Window width
        final int WINDOW_HEIGHT = 170;  // Window height

        // Set the window title.
        setTitle("Temperature Converter");

        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a FlowLayout manager to the content pane.
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Build the panels and add it to the frame.
        buildPanel1();
        buildPanel2();
        buildPanel3();
        buildPanel4();

        // Add the panels to the content pane.
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        // Display the window.
        setVisible(true);
    }

    private void buildPanel1() {
        // Create a JPanel object and let the panel
        // field reference it.
        panel1 = new JPanel();

        // Create a label to display a message.
        JLabel label1 = new JLabel("Celsius ");

        // Create a text field for the Celsius temp.
        celsius = new JTextField(10);

        // Add the label and text field to the panel.
        panel1.add(label1);
        panel1.add(celsius);
    }

    private void buildPanel2() {
        // Create a JPanel object and let the panel
        // field reference it.
        panel2 = new JPanel();

        // Create a label to display a message.
        JLabel label2 = new JLabel("Fahrenheit ");

        // Create a text field for the Celsius temp.
        fahrenheit = new JTextField(10);

        // Add the label and text field to the panel.
        panel2.add(label2);
        panel2.add(fahrenheit);
    }

    private void buildPanel3() {
        // Create a JPanel object and let the panel
        // field reference it.
        panel3 = new JPanel();

        // Create two radio buttons.
        celsiusButton = new JRadioButton("Celsius");
        fahrenheitButton = new JRadioButton("Fahrenheit");

        // Create a ButtonGroup object.
        ButtonGroup group = new ButtonGroup();

        // Add the radio buttons to the ButtonGroup object.
        group.add(celsiusButton);
        group.add(fahrenheitButton);

        // Add the radio buttons to the JPanel referenced by panel.
        panel3.add(celsiusButton);
        panel3.add(fahrenheitButton);
    }

    private void buildPanel4() {
        // Create a JPanel object and let the panel
        // field reference it.
        panel4 = new JPanel();

        // Create a button with the caption "Calculate".
        // To reference a button
        JButton calcButton = new JButton("Calculate");

        // Add the button to the panel.
        panel4.add(calcButton);
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        new TempConverterT1();
    }
}
