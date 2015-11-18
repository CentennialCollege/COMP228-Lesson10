package TipCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class TipCalculatorController {
	@FXML private Text messageText;
	@FXML private TextField nameTextField;
	@FXML private Button clickMeButton;
	
	public void clickMeButtonHandler(ActionEvent event) {
		messageText.setText(nameTextField.getText());
	}
}
