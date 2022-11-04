import javax.swing.*;
import java.awt.*;

public class PrinterWindow extends JFrame {

    final int WINDOW_WIDTH = 470;   // Window width in pixels
    final int WINDOW_HEIGHT = 220;  // Window height in pixels

    /**
     * Constructor
     */
    public PrinterWindow() {
        // Set the window title.
        setTitle("Printer");

        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a FlowLayout manager to the content pane.
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // Create four buttons.
        JButton button1 = new JButton("Ok");
        JButton button2 = new JButton("Cancel");
        JButton button3 = new JButton("Setup...");
        JButton button4 = new JButton("Help");

        // Create four check boxes.
        JCheckBox check1 = new JCheckBox("Image");
        JCheckBox check2 = new JCheckBox("Text");
        JCheckBox check3 = new JCheckBox("Code");
        JCheckBox check4 = new JCheckBox("Print to File");

        // Create three radio buttons.
        JRadioButton radio1 = new JRadioButton("Selection");
        JRadioButton radio2 = new JRadioButton("All", true);
        JRadioButton radio3 = new JRadioButton("Applet");

        // Create a ButtonGroup object.
        ButtonGroup group = new ButtonGroup();

        // Add the radio buttons to the ButtonGroup object.
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        // The following array holds the values that will
        // be displayed in the combo box.
        String[] printQuality = { "High", "Standard", "Low" };

        // Create the combo box.
        JComboBox<String> comboBox = new JComboBox<>(printQuality);

        // Create two labels.
        JLabel label1 = new JLabel("Printer: MyPrinter");
        JLabel label2 = new JLabel("Print Quality:");

        // Create two panels.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // Add layouts manager to the panels.
        panel1.setLayout(new GridLayout(4, 4));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Add the components to the panels.
        panel1.add(new JPanel());
        panel1.add(check1);
        panel1.add(radio1);
        panel1.add(button1);

        panel1.add(new JPanel());
        panel1.add(check2);
        panel1.add(radio2);
        panel1.add(button2);

        panel1.add(new JPanel());
        panel1.add(check3);
        panel1.add(radio3);
        panel1.add(button3);

        panel1.add(label2);
        panel1.add(comboBox);
        panel1.add(check4);
        panel1.add(button4);

        panel2.add(panel1);

        // Add the panels to the content pane.
        add(label1);
        add(panel2);

        // Display the window.
        setVisible(true);
    }

    public static void main(String[] args) {
        new PrinterWindow();
    }
}
