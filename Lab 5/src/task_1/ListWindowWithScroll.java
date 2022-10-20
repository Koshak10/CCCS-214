import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListWindowWithScroll extends JFrame {

    private JPanel seasonPanel; // To hold components
    private JPanel selectedSeasonPanel; // To hold components
    private JList<String> seasonList; // The seasons
    private JTextField selectedSeason; // The selected season

    // The following array holds the values that will
    // be displayed in the seasonList list component.
    private String[] seasons = { "Summer", "Fall", "Winter", "Spring" };

    /**
     * Constructor
     */
    public ListWindowWithScroll() {
        // Set the title.
        setTitle("Favourite Season");

        // Set the size of the window
        setSize(300, 170);

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a BorderLayout manager.
        setLayout(new BorderLayout());

        // Build the season and selectedSeason panels.
        buildSeasonPanel();
        buildSelectedSeasonPanel();

        // Create the label.
        JLabel label = new JLabel("Please select your favourite season: ");

        // Add the panels to the content pane.
        add(label, BorderLayout.NORTH);
        add(seasonPanel, BorderLayout.CENTER);
        add(selectedSeasonPanel, BorderLayout.SOUTH);

        // Display the window.
        setVisible(true);
    }

    /**
     * The buildSeasonPanel method adds a list containing
     * the names of the seasons to a panel.
     */
    private void buildSeasonPanel() {
        // Create a panel to hold the list.
        seasonPanel = new JPanel();

        // Create the list.
        seasonList = new JList<>(seasons);

        // Set the selection mode to single selection.
        seasonList.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION);

        // Register the list selection listener.
        seasonList.addListSelectionListener(
                new ListListener());

        // Set the number of visible rows to 6.
        seasonList.setVisibleRowCount(3);

        // Add the list to a scroll pane.
        JScrollPane scrollPane = new JScrollPane(seasonList);

        // Add the scroll pane to the panel.
        seasonPanel.add(scrollPane);
    }

    /**
     * The buildSelectedSeasonPanel method adds an
     * uneditable text field to a panel.
     */
    private void buildSelectedSeasonPanel() {
        // Create a panel to hold the text field.
        selectedSeasonPanel = new JPanel();

        // Create the label.
        JLabel label = new JLabel("You selected: ");

        // Create the text field.
        selectedSeason = new JTextField(10);

        // Make the text field uneditable.
        selectedSeason.setEditable(false);

        // Add the label and text field to the panel.
        selectedSeasonPanel.add(label);
        selectedSeasonPanel.add(selectedSeason);
    }

    /**
     * Private inner class that handles the event when
     * the user selects an item from the list.
     */
    private class ListListener implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            // Get the selected season.
            String selection = seasonList.getSelectedValue();

            // Put the selected season in the text field.
            selectedSeason.setText(selection);
        }
    }

    /**
     * The main method creates an instance of the
     * ListWindowWithScroll class which causes it to display
     * its window.
     */
    public static void main(String[] args) {
        new ListWindowWithScroll();
    }
}
