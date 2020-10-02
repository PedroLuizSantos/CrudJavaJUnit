package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ControllerMenu {
	
	 	@FXML
	    private TextField textName;

	    @FXML
	    private AnchorPane BtnSalvar;

	    @FXML
	    void BtnMostra(ActionEvent event) {
	    	System.out.println(textName.getText());

	    }
}


