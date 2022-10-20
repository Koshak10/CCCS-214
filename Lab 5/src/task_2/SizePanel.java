import javax.swing.*;

/**
 * The SizePanel class allows the user to select
 * the size of window shade from combo box.
 */
public class SizePanel extends JPanel {

    // The following constants are used to indicate
    // the cost of sizes.
    public final int SIZE_25 = 0;
    public final int SIZE_27 = 2;
    public final int SIZE_32 = 4;

    private JComboBox<String> comboBox; // A list of sizes

    // The following array holds the values that will
    // be displayed in the combo box.
    private String[] size = { "25 Inches", "27 Inches", "32 Inches" };

    /**
     * Constructor
     */
    public SizePanel() {
        // Create the combo box.
        comboBox = new JComboBox<>(size);

        // Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Shade Size"));

        // Add the combo box to the panel.
        add(comboBox);
    }

    /**
     * getSizeCost method
     * @return The cost of the selected shade size.
     */
    public int getSizeCost() {
        int sizeCost = SIZE_25;

        int index = comboBox.getSelectedIndex();
        switch (index) {
            case 1 -> sizeCost = SIZE_27;
            case 2 -> sizeCost = SIZE_32;
        }

        return sizeCost;
    }
}
