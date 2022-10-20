import javax.swing.*;

/**
 * The StylePanel class allows the user to select the
 * style of window shade from a combo box.
 */
public class StylePanel extends JPanel {

    // The following constants are used to indicate
    // the cost of each shade styles.
    public final int REGULAR_SHADES = 0;
    public final int FOLDING_SHADES = 10;
    public final int ROMAN_SHADES = 15;

    private JComboBox<String> comboBox; // A list of shade styles

    // The following array holds the values that will
    // be displayed in the combo box.
    private String[] styles = {"Regular shades", "Folding shades", "Roman shades"};

    /**
     * Constructor
     */
    public StylePanel() {
        // Create the combo box.
        comboBox = new JComboBox<>(styles);

        // Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Shade Style"));

        // Add the combo box to the panel.
        add(comboBox);
    }

    /**
     * getStyleCost method
     * @return The cost of the selected shade style.
     */
    public int getStyleCost() {
        int styleCost = REGULAR_SHADES;

        int index = comboBox.getSelectedIndex();
        if (index == 1) {
            styleCost = FOLDING_SHADES;
        } else if (index == 2) {
            styleCost = ROMAN_SHADES;
        }

        return styleCost;
    }
}
