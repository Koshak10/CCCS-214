import javax.swing.*;
import java.awt.*;

public class TempConverterT1 extends JFrame {

    final int WINDOW_WIDTH = 320;   // Window width
    final int WINDOW_HEIGHT = 170;  // Window height

    /**
     * Constructor
     */
    public TempConverterT1() {
        // Set the window title.
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

        // Create two text fields.
        JTextField celsius = new JTextField(10);
        JTextField fahrenheit = new JTextField(10);

        // Create two radio buttons.
        JRadioButton radio1 = new JRadioButton("Celsius");
        JRadioButton radio2 = new JRadioButton("Fahrenheit");

        // Create a ButtonGroup object.
        ButtonGroup group = new ButtonGroup();

        // Add the radio buttons to the ButtonGroup object.
        group.add(radio1);
        group.add(radio2);

        // Create a button with the caption "Calculate".
        JButton calcButton = new JButton("Calculate");

        // Add the components to the panels.
        panel1.add(label1);
        panel1.add(celsius);
        panel2.add(label2);
        panel2.add(fahrenheit);
        panel3.add(radio1);
        panel3.add(radio2);
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
     * The main method creates an instance of the
     * TempConverterT1 class, causing it to display
     * its window.
     */
    public static void main(String[] args) {
        new TempConverterT1();
    }
}
