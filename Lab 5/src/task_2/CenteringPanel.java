import javax.swing.*;
import java.awt.*;

/**
 * The CenteringPanel class is used to place the middle
 * components in the center of the window.
 */
public class CenteringPanel extends JPanel {

    private StylePanel styles; // Style panel
    private SizePanel sizes; // Size panel

    /**
     * Constructor
     */
    public CenteringPanel() {
        // Set the layout manager.
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25));

        // Create the custom panels.
        styles = new StylePanel();
        sizes = new SizePanel();

        // Add the other panels to this panel.
        add(styles);
        add(sizes);
    }

    /**
     * getStyles method
     * @return The styles panel.
     */
    public StylePanel getStyles() {
        return styles;
    }

    /**
     * getSizes method
     * @return The sizes panel.
     */
    public SizePanel getSizes() {
        return sizes;
    }
}
