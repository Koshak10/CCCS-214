import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The OrderCalculatorGUI class creates the GUI for the
 * Window Shade Designer application.
 */
public class OrderCalculatorGUI extends JFrame {

    private GreetingPanel banner; // To display a greeting
    private CenteringPanel center; // To center other panels
    private JPanel buttonPanel; // To hold the buttons
    private JButton calcButton; // To calculate the cost
    private JButton exitButton; // To exit the application
    private final int BASE_FEE = 50; // Charge fee

    /**
     * Constructor
     */
    public OrderCalculatorGUI() {
        final int WINDOW_WIDTH = 410; // Window width in pixels
        final int WINDOW_HEIGHT = 260; // Window height in pixels

        // Display a title.
        setTitle("Window Shade Designer");

        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a BorderLayout manager.
        setLayout(new BorderLayout());

        // Create the custom panels.
        banner = new GreetingPanel();
        center = new CenteringPanel();

        // Create the button panel.
        buildButtonPanel();

        // Add the components to the content pane.
        add(banner, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Display the window.
        setVisible(true);
    }

    /**
     * The buildButtonPanel method builds the button panel.
     */
    private void buildButtonPanel() {
        // Create a panel for the buttons.
        buttonPanel = new JPanel();

        // Create the buttons.
        calcButton = new JButton("Calculate");
        exitButton = new JButton("Exit");

        // Register the action listeners.
        calcButton.addActionListener(new CalcButtonListener());
        exitButton.addActionListener(new ExitButtonListener());

        // Add the buttons to the button panel.
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }

    /**
     * Private inner class that handles the event when
     * the user clicks the Calculate button.
     */
    private class CalcButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // Variables to hold the subtotal and total
            int subtotal, total;

            // Calculate the subtotal.
            subtotal = center.getStyles().getStyleCost() +
                    center.getSizes().getSizeCost();

            // Calculate the total.
            total = subtotal + BASE_FEE;

            // Display the charges.
            JOptionPane.showMessageDialog(null,
                    String.format("""
                                    Subtotal: $%d
                                    Charge fee: $%d
                                    Total: $%d""",
                            subtotal, BASE_FEE, total));
        }
    }

    /**
     * Private inner class that handles the event when
     * the user clicks the Exit button.
     */
    private class ExitButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        new OrderCalculatorGUI();
    }
}
