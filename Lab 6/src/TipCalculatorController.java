import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TipCalculatorController {

    @FXML
    private Label amountToTipLabel;

    @FXML
    private Button calcButton;

    @FXML
    private TextField chargeTextField;

    @FXML
    private Label outputLabel;

    @FXML
    private Label promptLabel;

    // This optional method is called when the FXML file is loaded.
    public void initialize() {
        // Perform any necessary initialization here.
    }

    // Event listener for the calcButton
    public void calculateButtonListener() {
        // Get the restaurant charge from the TextField.
        String str = chargeTextField.getText();

        // Convert the input to an int.
        double originalPrice = Double.parseDouble(str);

        // Calculate the amount to tip.
        double totalTip = originalPrice * 20.0 / 100;

        // Display the amount to tip.
        outputLabel.setText(String.format("$%.2f", totalTip));
    }
}
