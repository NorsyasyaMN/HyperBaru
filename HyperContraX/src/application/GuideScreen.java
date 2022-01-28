package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GuideScreen {

	@FXML
    private Button buttonMain;
	
    @FXML
    void exitGuide(ActionEvent event) {
    	// Close stage after button clicked
        Stage stage = (Stage) buttonMain.getScene().getWindow();
        stage.close();
    }

}